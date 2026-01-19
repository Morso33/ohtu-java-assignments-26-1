public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0;
    }

    // To display shape info
    @Override
    public String toString() {
        return "Shape with color " + color;
    }
}
