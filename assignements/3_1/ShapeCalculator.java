public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator\n");

        // Polymorphic array of shapes
        Shape[] shapes = {
            new Circle(5.0, "Red"),
            new Rectangle(4.0, 6.0, "Blue"),
            new Triangle(3.0, 8.0, "Green")
        };

        // Loop through shapes and display area
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + ": Area = " + shape.calculateArea());
        }
    }
}