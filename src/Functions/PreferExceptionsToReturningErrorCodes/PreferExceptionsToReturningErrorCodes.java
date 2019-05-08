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


    public void testFunction() {
        delete(page);
    }

    private void delete(Page page) {
        try {
            deletePageAndReferences(page);
        }
        catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndReferences(Page page) throws Exception {
        deletePage(page);
        registry.deleteReference(page.name);
        configKeys.deleteKey(page.name.makeKey());
    }

    private void logError(Exception e) {
        logger.log(e.getMessage());
    }

    private void deletePage(Page page) {
        // Do something
    }
}
