package advancedCoding.mostenire_polimorfism.task3;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape("Red", true);
        System.out.println(shape1);
        Shape circle1 = new Circle("blue", false, 33.33);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        Shape rectangle1 = new Rectangle("black", true, 20, 30);
        System.out.println(rectangle1.getPerimeter());
        Shape square1 = new Square("yellow", true, 20);
        System.out.println(square1.getPerimeter());
    }
}
