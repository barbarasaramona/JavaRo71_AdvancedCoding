package advancedCoding.mostenire_polimorfism.task03;

public class Shape {
    private String color;
    private boolean isColored;

    public Shape(){
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

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Shape with ");
//        sb.append("color of ").append(color);
//        sb.append(" and ");
//        if (this.isColored) {
//            sb.append("filled");
//        } else {
//            sb.append("not filled");
//        }
//        return sb.toString();
//    }


    @Override
    public String toString() {
        return "Shape with " +
                "color of '" + color + '\'' +
                (isColored ? ", colored" : ", not colored");
    }

    public double getArea() {
        System.out.print("area: " );
        return 0;
    }

    public double getPerimeter() {
        System.out.print("perimeter: ");
        return 0;
    }
}
