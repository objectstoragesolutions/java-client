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
}
