package advancedCoding.mostenire_polimorfism.task03;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape circle1 = new Circle("blue", false, 33.33);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Shape rectangle1 = new Rectangle("black", true, 28, 30);
        System.out.println(rectangle1.getPerimeter());
    }
}
