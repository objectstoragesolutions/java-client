import com.cleverdome.api.*;
import com.cleverdome.auth.apikeys.*;
import org.apache.axis.AxisProperties;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;
import javax.xml.rpc.ServiceException;

public class Demo {
    public static void main(String[] args) throws Exception {
        Properties demoProps = new Properties();
        InputStream inputStream = Demo.class.getResourceAsStream("demo.properties");
        demoProps.load(inputStream);

        String apiKey = demoProps.getProperty("apiKey");
        String userID = demoProps.getProperty("userID");
        String[] ipAddresses = demoProps.getProperty("ipAddresses").split(";");

        ApiKeyResponseMessage responseMessage = getApiKeyResponse(apiKey, userID, ipAddresses);
        if (!responseMessage.getIsSuccess()) {
            throw new Exception(responseMessage.getErrorMessage());
        }
        String sessionID = responseMessage.getSessionID();
        System.out.println("SessionID: " + sessionID);

        UserManagementDemo userManagementDemo = UserManagementDemo.getInstance();
        userManagementDemo.testUserCreation();
        userManagementDemo.testUserCheck();
        userManagementDemo.testUserDelete();

        Integer applicationID = Integer.parseInt(demoProps.getProperty("applicationID"));
        String fileName = demoProps.getProperty("fileName");
        InputStream fileStream = Demo.class.getResourceAsStream(fileName);
        byte[] fileData = readBytesFromInputStream(fileStream);
        String fileBase64String = Base64.getEncoder().encodeToString(fileData);
        String documentID = uploadFile(sessionID, applicationID, null, null, null, fileName, fileBase64String);
        System.out.println("DocumentID: " + documentID);

        DocumentField[] allowedFields = getAllowedFields(sessionID, documentID);
        for (DocumentField documentField : allowedFields) {
            System.out.println(documentField.getID() + ": " + documentField.getName());
        }

        int fieldID = Integer.parseInt(demoProps.getProperty("fieldID"));
        String fieldValue = demoProps.getProperty("fieldValue") + " from " + (new Date()).toString();
        addField(sessionID, documentID, fieldID, fieldValue);

        DocumentMetadataValueBase[] metadataValues = getDocumentFields(sessionID, documentID, fieldID);
        for (DocumentMetadataValueBase metadataValue: metadataValues) {
            System.out.println(metadataValue.getFieldName() + ": " + metadataValue.getFieldValue());
        }

        testSecurityGroups(sessionID, documentID, userID, applicationID);
    }

    public static ApiKeyResponseMessage getApiKeyResponse(String apiKey, String userID, String[] ipAddresses) throws RemoteException, ServiceException {
        ApiKeyServiceLocator apiKeyServiceLocator = new ApiKeyServiceLocator();
        IApiKeyService keyService = apiKeyServiceLocator.getBasicHttpBinding_IApiKeyService();

        ApiKeyRequestMessage requestMessage = new ApiKeyRequestMessage(apiKey, ipAddresses, userID);
        return keyService.auth(requestMessage);
    }

    public static String uploadFile(String sessionID, Integer applicationID, Integer templateID, Integer descriptionID,
                                 DocumentMetadataValueBase[] metadata, String fileName, String fileBase64String)
            throws RemoteException, ServiceException {
        WidgetsLocator widgetsLocator = new WidgetsLocator();
        IWidgets widgets = widgetsLocator.getBasicHttpBinding_IWidgets();
        return widgets.uploadFileJava(sessionID, applicationID, templateID, descriptionID, metadata, fileName, fileBase64String);
    }

    public static DocumentField[] getAllowedFields(String sessionID, String documentID) throws RemoteException, ServiceException {
        WidgetsLocator widgetsLocator = new WidgetsLocator();
        IWidgets widgets = widgetsLocator.getBasicHttpBinding_IWidgets();
        return widgets.getAllowedFieldsForDocument(sessionID, documentID).getReturnValue();
    }

    public static DocumentMetadataValueBase[] getDocumentFields(String sessionID, String documentID, int fieldID) throws RemoteException, ServiceException {
        WidgetsLocator widgetsLocator = new WidgetsLocator();
        IWidgets widgets = widgetsLocator.getBasicHttpBinding_IWidgets();
        return widgets.getMetadataValuesForFieldType(sessionID, documentID, fieldID).getReturnValue();
    }

    public static void addField(String sessionID, String documentID, int fieldID, String fieldValue)
            throws RemoteException, ServiceException {
        WidgetsLocator widgetsLocator = new WidgetsLocator();
        IWidgets widgets = widgetsLocator.getBasicHttpBinding_IWidgets();

        DocumentMetadataValueBase field = new DocumentMetadataValueBase();
        field.setFieldValue(fieldValue);
        field.setFieldID(fieldID);

        DocumentMetadataValueBase[] fields = new DocumentMetadataValueBase[] { field };

        widgets.setMetadataValues(sessionID, documentID, fields, new int[0]);
    }

    public static byte[] readBytesFromInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();

        return buffer.toByteArray();
    }

    public static void testSecurityGroups(String sessionID, String documentID, String externalOwnerID, int applicationID)
            throws ServiceException, RemoteException {

        WidgetsLocator widgetsLocator = new WidgetsLocator();
        IWidgets widgets = widgetsLocator.getBasicHttpBinding_IWidgets();

        int securityGroupID = createSecurityGroup(widgets, sessionID, applicationID);
        addUsersToSecurityGroup(widgets, sessionID, securityGroupID);
        printSecurityGroup(widgets, sessionID, securityGroupID);

        removeAllUsersFromSecurityGroup(widgets, sessionID, securityGroupID);
        printSecurityGroup(widgets, sessionID, securityGroupID);

        System.out.println("Attaching security group to the document");
        // TODO: change magic 200 to PermissionLevel enum
        widgets.attachSecurityGroupsToDocument(sessionID, documentID, new int[] { securityGroupID }, 200);
        SecurityGroupData groupsBeforeDeletion = widgets.getSecurityGroups(sessionID, documentID).getReturnValue();

        System.out.println("Groups count before removing: " + groupsBeforeDeletion.getDocumentSecurityData().length + ".");
        System.out.println("Removing security group from the document");
        widgets.removeSecurityGroupFromDocument(sessionID, documentID, securityGroupID);
        SecurityGroupData groupsAfterDeletion = widgets.getSecurityGroups(sessionID, documentID).getReturnValue();
        System.out.println("Groups count after removing: " + groupsAfterDeletion.getDocumentSecurityData().length + ".");

        widgets.removeSecurityGroup(sessionID, securityGroupID);
    }

    public static int createSecurityGroup(IWidgets widgets, String sessionID, int applicationID) throws RemoteException {
        // TODO: get internal user identifier from VendorManagementService
        int internalUserID = 5260;

        OperationResultOfSecurityGroupwJCT_PyJf createGroupResult =
                widgets.createSecurityGroup(sessionID, "Test 1", "Test Security Group 1", 1, internalUserID, applicationID);
        int securityGroupID = createGroupResult.getReturnValue().getID().intValue();

        return securityGroupID;
    }

    public static void removeAllUsersFromSecurityGroup(IWidgets widgets, String sessionID, int securityGroupID) throws RemoteException {
        System.out.println("Removing users from security group with id = " + securityGroupID);

        UserData[] users = widgets.getUsersForGroup(sessionID, securityGroupID).getReturnValue();
        for (UserData user: users)
        {
            OperationResultOfanyType result = widgets.removeUserFromSecurityGroup(sessionID, securityGroupID, user.getID());
        }
    }

    public static void addUsersToSecurityGroup(IWidgets widgets, String sessionID, int securityGroupID) throws RemoteException {
        System.out.println("Adding users to security group with id = " + securityGroupID);

        int[] usersToAdd = {1, 2, 3};
        for (int userID : usersToAdd) {
            widgets.addUserToSecurityGroup(sessionID, securityGroupID, userID);
        }
    }

    public static void printSecurityGroup(IWidgets widgets, String sessionID, int securityGroupID) throws RemoteException {
        UserData[] users = widgets.getUsersForGroup(sessionID, securityGroupID).getReturnValue();
        if(users.length == 0){
            System.out.println("No users in the security group.");
        } else
        {
            System.out.println("Security group users:");
            for (UserData user: users)
            {
                System.out.println("\tID: " +  user.getID() + ", Name: " + user.getFullName() + ".");
            }
        }
    }
}
