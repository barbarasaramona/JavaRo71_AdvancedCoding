package advancedCoding.mostenire_polimorfism.task03;

public class Circle extends Shape{
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
    public double getArea() {
        return super.getArea() + Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() + 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle has a radius of: ");
        sb.append(radius);
        sb.append(" and a perimeter of: ");
        sb.append(getPerimeter());
        sb.append(" and an area of: ");
        sb.append(getArea());
        return sb.toString();
    }
}
