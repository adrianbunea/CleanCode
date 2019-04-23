package MeaningfulNames;
import java.util.*;

public class IntentionRevealingNames {
    class Cell {
        static final int FLAGGED = 4;
        int statusValue;

        public boolean isFlagged() {
            return statusValue == FLAGGED;
        }
    }

    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    List<Cell> gameBoard;
    List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
