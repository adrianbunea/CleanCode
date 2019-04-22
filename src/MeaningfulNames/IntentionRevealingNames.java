package MeaningfulNames;
import java.util.*;

public class IntentionRevealingNames {
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    public static final int STATUS_VALUE = 0;
    public static final int FLAGGED = 4;
    List<int[]> gameBoard;
    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
