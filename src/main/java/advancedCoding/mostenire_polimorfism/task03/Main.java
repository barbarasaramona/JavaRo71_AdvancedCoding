package advancedCoding.mostenire_polimorfism.task03;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape("Red", true);
        Circle circle1 = new Circle("Blue", false, 33.33);
        Shape rectangle1 = new Rectangle("Black", true, 20, 30);
        Shape square1 = new Square("Yellow", true, 20);
        System.out.println(shape1);

        System.out.println(circle1);
        System.out.println(circle1.getArea() + " " + circle1.getPerimeter());

        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

        System.out.println(square1);
        System.out.println(square1.getPerimeter());

    }
}
