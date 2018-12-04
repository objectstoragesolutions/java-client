import com.cleverdome.vendormgmt.IVendorUserManagement;
import com.cleverdome.vendormgmt.VendorUserManagementLocator;

import javax.xml.rpc.ServiceException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Properties;

public class UserManagementDemo {
    IVendorUserManagement vendorUserManagement;
    Properties demoProps;

    public UserManagementDemo(IVendorUserManagement vendorUserManagement, Properties demoProperties) {
        this.vendorUserManagement = vendorUserManagement;
        this.demoProps = demoProperties;
    }

    public static UserManagementDemo getInstance(VendorUserManagementLocator.VendorUserManagement_address address ) throws IOException, ServiceException {
        VendorUserManagementLocator vendorUserManagementLocator =
                new VendorUserManagementLocator(address);

        Properties demoProps = new Properties();
        InputStream inputStream = Demo.class.getResourceAsStream("demo.properties");
        demoProps.load(inputStream);

        return new UserManagementDemo(
                vendorUserManagementLocator.getBasicHttpBinding_IVendorUserManagement(),
                demoProps);
    }

    public void testUserCreation() {
        try {
            String vendorUserExternalID = demoProps.getProperty("vendorUserExternalID");
            String vendorUserFirstName = demoProps.getProperty("vendorUserFirstName");
            String vendorUserLastName = demoProps.getProperty("vendorUserLastName");
            String vendorUserEmail = demoProps.getProperty("vendorUserEmail");
            String vendorUserPhone = demoProps.getProperty("vendorUserPhone");
            System.out.printf("Trying to create new user with ExternalID: %s, FirstName: %s, " +
                    "LastName: %s, Email: %s, Phone: %s%n", vendorUserExternalID,
                    vendorUserFirstName, vendorUserLastName, vendorUserEmail, vendorUserPhone);

            Integer userID = vendorUserManagement.createUser(
                    demoProps.getProperty("apiKey"),
                    vendorUserExternalID,
                    vendorUserFirstName,
                    vendorUserLastName,
                    vendorUserEmail,
                    vendorUserPhone);

            System.out.println("Success. Created user got UserID: " + userID);
        } catch (Exception ex) {
            System.out.println("Failure. " + ex);
        }
    }

    public void testUserCheck() {
        try {
            String vendorUserExternalID = demoProps.getProperty("vendorUserExternalID");
            System.out.println("Trying to check user with ExternalID: " + vendorUserExternalID);

            Integer userID = getCleverDomeUserID(vendorUserExternalID);
            if (userID == null) {
                System.out.println("Success. User is not in the system.");
            } else {
                System.out.println("Success. User is already in the system. UserID: " + userID);
            }
        } catch (Exception ex) {
            System.out.println("Failure. " + ex);
        }
    }

    public void testUserDelete() {
        try {
            String vendorUserExternalID = demoProps.getProperty("vendorUserExternalID");
            System.out.println("Trying to delete user with ExternalID: " + vendorUserExternalID);

            vendorUserManagement.deleteUser(demoProps.getProperty("apiKey"),
                    vendorUserExternalID);
            System.out.println("Success. User is deleted.");
        } catch (Exception ex) {
            System.out.println("Failure. " + ex);
        }
    }

    public int getCleverDomeUserID(String externalUserID) throws RemoteException {
        return vendorUserManagement.getCleverDomeUserID(demoProps.getProperty("apiKey"),
                externalUserID);
    }
}
