public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }
    private boolean capOn;
    private Color color;
    public Pen() {
        this.color = Color.RED;
        this.capOn = true;
    }
    public Pen(Color color) {
        this.color = color;
        this.capOn = true;
    }
    public void capOn(){
        capOn = true;
    }
    public void capOff() {
        capOn = false;
    }
    public String draw(){
        if (capOn) {
            return "";
        } else {
            return "Drawing " + color.toString();
        }
    }
    public void changeColor(Color color) {
        if (!capOn) {
            return;
        }
        this.color = color;
    }
}