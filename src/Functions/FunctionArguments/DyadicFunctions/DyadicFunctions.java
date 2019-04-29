package Functions.FunctionArguments.DyadicFunctions;

public class DyadicFunctions {
    String name;
    void writeField(String name) {
        this.name = name;
    }

    class Point {
        int x, y;

        // A point requires 2 points to define its coordinates
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}