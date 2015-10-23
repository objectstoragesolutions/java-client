import com.cleverdome.auth.apikeys.*;

import java.io.InputStream;
import java.rmi.RemoteException;
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
        System.out.println("SessionID: " + responseMessage.getSessionID());
    }

    public static ApiKeyResponseMessage getApiKeyResponse(String apiKey, String userID, String[] ipAddresses) throws RemoteException, ServiceException {
        ApiKeyServiceLocator apiKeyServiceLocator = new ApiKeyServiceLocator();
        IApiKeyService keyService = apiKeyServiceLocator.getBasicHttpBinding_IApiKeyService();

        ApiKeyRequestMessage requestMessage = new ApiKeyRequestMessage(apiKey, ipAddresses, userID);
        return keyService.auth(requestMessage);
    }
}
