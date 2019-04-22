package MeaningfulNames;
import java.util.*;

class Cell {
    static final int FLAGGED = 4;
    int statusValue;

    public boolean isFlagged() {
        return statusValue == FLAGGED;
    }
}

public class IntentionRevealingNames {
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    List<Cell> gameBoard;
    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
