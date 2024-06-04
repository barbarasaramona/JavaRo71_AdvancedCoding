package advancedCoding.mostenire_polimorfism.task03;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isColored, double width, double length) {
        super(color, isColored);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return super.getArea() + width * length;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() + 2 * (width + length);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle: ");
        sb.append("width: ").append(width);
        sb.append(", length: ").append(length);
        return sb.toString();
    }
}
