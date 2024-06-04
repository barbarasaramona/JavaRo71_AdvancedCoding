package advancedCoding.mostenire_polimorfism.task3;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1;
    }
    public Circle(String color, boolean isColored, double radius) {
        super(color, isColored);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea () {
        return super.getArea() + radius * radius * Math.PI;
    }
    @Override
    public double getPerimeter () {
        return super.getPerimeter() + 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle with radius ");
        sb.append(radius);
        sb.append(" which is a subclass of ").append(super.toString());
        return sb.toString();
    }
}
