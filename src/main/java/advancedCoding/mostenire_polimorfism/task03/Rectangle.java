package advancedCoding.mostenire_polimorfism.task03;

public class Rectangle extends Shape{

    private double width;
    private double lenght;

    public Rectangle() {
        this.width = 1;
        this.lenght = 1;
    }

    public Rectangle(String color, boolean isColored, double width, double lenght) {
        super(color, isColored);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return super.getArea() + lenght * width;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() + (2 * lenght) + (2 * width);
    }

    @Override
    public String toString() {
        return "Rectangle with " +
                "width= " + width +
                ", lenght= " + lenght + " which is a subclass off " + super.toString();
    }
}
