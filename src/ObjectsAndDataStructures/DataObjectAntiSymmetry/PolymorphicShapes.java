package ObjectsAndDataStructures.DataObjectAntiSymmetry;

import ObjectsAndDataStructures.DataObjectAntiSymmetry.HelperClasses.Point;
import ObjectsAndDataStructures.DataObjectAntiSymmetry.HelperClasses.Shape;

public class PolymorphicShapes {
    public class Square implements Shape {
        public Point topLeft;
        public double side;

        public double area() {
            return side*side;
        }
    }

    public class Rectangle implements Shape{
        public Point topLeft;
        public double height;
        public double width;

        public double area() {
            return height * width;
        }
    }

    public class Circle implements Shape{
        public Point center;
        public double radius;
        public final double PI = 3.141592653589793;

        public double area() {
            return PI * radius * radius;
        }
    }
}
