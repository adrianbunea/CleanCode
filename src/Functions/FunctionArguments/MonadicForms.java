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
}
