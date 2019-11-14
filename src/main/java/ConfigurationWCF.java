import com.cleverdome.api.WidgetsLocator;
import com.cleverdome.auth.apikeys.ApiKeyServiceLocator;
import com.cleverdome.vendormgmt.VendorUserManagementLocator;

public class ConfigurationWCF {
    private WcfMode mode;
    public  ConfigurationWCF(String configurationMode) throws Exception {
        if(configurationMode != null && !configurationMode.trim().isEmpty())
        {
            switch (configurationMode.trim().toLowerCase())
            {
                case "prod": mode = WcfMode.Prod; break;
                case "sandbox": mode = WcfMode.Sandbox; break;
                case "test": mode = WcfMode.Test; break;
                default:
                {
                    System.out.println("Configuration mode not found. Please choose correct configuration mode.");
                    throw new Exception("Configuration mode not found");
                }
            }
        }
        else
        {
            System.out.println("Configuration mode not set. Please set required configuration mode.");
            throw new Exception("Configuration mode not set");
        }
    }

    public ApiKeyServiceLocator.ApiKeyServiceLocator_address  GetApiKeyServiceLocator_address() throws Exception {
        switch (mode)
        {
            case Prod:    return  ApiKeyServiceLocator.ApiKeyServiceLocator_address.Prod;
            case Sandbox: return  ApiKeyServiceLocator.ApiKeyServiceLocator_address.SandBox;
            case Test:    return  ApiKeyServiceLocator.ApiKeyServiceLocator_address.Test;
            default:      throw new Exception("ApiKeyServiceLocator address not found");
        }
    }

    public VendorUserManagementLocator.VendorUserManagement_address GetVendorUserManagement_address() throws Exception {
        switch (mode)
        {
            case Prod:    return  VendorUserManagementLocator.VendorUserManagement_address.Prod;
            case Sandbox: return  VendorUserManagementLocator.VendorUserManagement_address.SandBox;
            case Test:    return  VendorUserManagementLocator.VendorUserManagement_address.Test;
            default:      throw new Exception("VendorUserManagement address not found");
        }
    }

    public WidgetsLocator.WidgetsLocator_address GetWidgetsLocator_address() throws Exception {
        switch (mode)
        {
            case Prod:    return  WidgetsLocator.WidgetsLocator_address.Prod;
            case Sandbox: return  WidgetsLocator.WidgetsLocator_address.SandBox;
            case Test:    return  WidgetsLocator.WidgetsLocator_address.Test;
            default:      throw new Exception("WidgetsLocator address not found");
        }
    }
}
