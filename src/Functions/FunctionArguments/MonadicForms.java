package Functions.FunctionArguments;

import java.io.IOException;
import java.io.InputStream;

public class MonadicForms {
    boolean fileExists(String filename) {
        return true;
    }

    InputStream fileOpen(String filename) {
        return new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }

    void passwordFailedNTimes(int attempts) {
        /* Do something */
    }

    // Bad monadic form
    StringBuffer includeSetupInto(StringBuffer pageText){
        /* Do something to the argument then return it */
        return pageText;
    }
}
