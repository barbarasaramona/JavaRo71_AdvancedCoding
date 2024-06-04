package advancedCoding.mostenire_polimorfism.task3;

public class Shape {
    private String color;
    private boolean isColored;

    public Shape() {
        this.color = "unknown";
        this.isColored = false;
    }

    public Shape(String color, boolean isColored) {
        this.color = color;
        this.isColored = isColored;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape with color of ");
        sb.append(color);
//        if (isColored) {
//            sb.append(" colored");
//        } else {
//            sb.append(" not colored");
//        }
        sb.append(isColored ? " colored" : " not colored");
        return sb.toString();
    }

    public double getArea () {
        System.out.print("area: ");
        return 0;
    }
    public double getPerimeter () {
        System.out.print("perimeter: ");
        return 0;
    }
}
