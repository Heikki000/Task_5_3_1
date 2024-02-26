public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }
    private Color color;
    public Pen() {
        this.color = Color.RED;
    }
    public Pen(Color color) {
        this.color = color;
    }
    public boolean capOn(){
        return true;
    }
    public boolean capOff() {
        return false;
    }
    public String draw(){
        if (capOn()) {
            return "";
        } else {
            return "Drawing " + color.toString();
        }
    }
    public void changeColor(Color color) {
        if (capOff()) {
            return;
        }
        this.color = color;
    }
}