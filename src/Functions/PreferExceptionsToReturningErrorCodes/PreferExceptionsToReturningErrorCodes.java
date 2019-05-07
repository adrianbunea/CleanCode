package Functions.PreferExceptionsToReturningErrorCodes;

import Functions.PreferExceptionsToReturningErrorCodes.HelperClasses.ConfigKeys;
import Functions.PreferExceptionsToReturningErrorCodes.HelperClasses.Logger;
import Functions.PreferExceptionsToReturningErrorCodes.HelperClasses.Registry;
import Functions.PreferExceptionsToReturningErrorCodes.HelperClasses.Page;

public class PreferExceptionsToReturningErrorCodes {
    Logger logger = new Logger();
    Registry registry = new Registry();
    ConfigKeys configKeys = new ConfigKeys();
    Page page = new Page();

    public void deletePage(Page page) {
        // Do something
    }

    public void testFunction() {
        try {
            deletePage(page);
            registry.deleteReference(page.name);
            configKeys.deleteKey(page.name.makeKey());
        }
        catch (Exception e) {
            logger.log(e.getMessage());
        }
    }
}
