package Functions.PreferExceptionsToReturningErrorCodes;

import Functions.PreferExceptionsToReturningErrorCodes.HelperClasses.ConfigKeys;
import Functions.PreferExceptionsToReturningErrorCodes.HelperClasses.ErrorCodes;
import Functions.PreferExceptionsToReturningErrorCodes.HelperClasses.Logger;
import Functions.PreferExceptionsToReturningErrorCodes.HelperClasses.Registry;
import Functions.PreferExceptionsToReturningErrorCodes.HelperClasses.Page;

public class PreferExceptionsToReturningErrorCodes {
    Logger logger = new Logger();
    Registry registry = new Registry();
    ConfigKeys configKeys = new ConfigKeys();
    Page page = new Page();

    public ErrorCodes deletePage(Page page) {
        // Do something
        return ErrorCodes.E_OK;
    }

    public ErrorCodes testFunction() {
        if (deletePage(page) == ErrorCodes.E_OK) {
            if (registry.deleteReference(page.name) == ErrorCodes.E_OK) {
                if (configKeys.deleteKey(page.name.makeKey()) == ErrorCodes.E_OK) {
                    logger.log("page deleted");
                } else {
                    logger.log("configKey not deleted");
                }
            } else {
                logger.log("deleteReference from registry failed");
            }
        } else {
            logger.log("delete failed");
            return ErrorCodes.E_ERROR;
        }
        return ErrorCodes.E_OK;
    }
}
