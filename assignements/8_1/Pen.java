public class Pen {

    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;

        Color(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return color;
        }
    }

    private Color color;
    private boolean capOn;

    // Default constructor (RED)
    public Pen() {
        this(Color.RED);
    }

    // Constructor with selected color
    public Pen(Color color) {
        this.color = color;
        this.capOn = true;
    }

    public void capOn() {
        capOn = true;
    }

    public void capOff() {
        capOn = false;
    }

    public String draw() {
        if (capOn) {
            return "";
        }
        return "Drawing " + color;
    }

    public void changeColor(Color newColor) {
        if (capOn) {
            this.color = newColor;
        }
    }
}