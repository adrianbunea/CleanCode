package Formatting.HorizontalFormatting.OpennessAndDensity;

import Formatting.HorizontalFormatting.OpennessAndDensity.HelperClasses.LineWidthHistogram;

public class Association {
    int lineCount = 0;
    int totalChars = 0;
    LineWidthHistogram lineWidthHistogram = new LineWidthHistogram();

    private void measureLine(String line) {
        lineCount++;
        int lineSize = line.length();
        totalChars += lineSize;
        lineWidthHistogram.addLine(lineSize, lineCount);
        recordWidestLine(lineSize);
    }

    private void recordWidestLine(int lineSize) {

    }
}
