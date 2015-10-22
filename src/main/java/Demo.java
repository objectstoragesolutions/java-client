import com.cleverdome.auth.apikeys.*;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class Demo {
    public static void main(String[] args) throws Exception {
        String apiKey = "=BKH^a-TMM$b9(bN(;(R!wQ2G&iwoQBycLP.Cq(z1Zfm/Ay[}K2b1%b[-mn=V5Bi|G^9wv5qXjz:FK&oy+/xJ$}v$>5-s#6{xVaeF6B:s%2%_^e][CxE3Sl!HI-fLuV:";
        String userID = "1";
        String[] ipAddresses = new String[] { "127.0.0.1" };

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
