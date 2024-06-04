package advancedCoding.mostenire_polimorfism.task03;

public class Square extends Rectangle{

    public Square(String color, boolean isColored, double side) {
        super(color, isColored, side, side);
    }
    @Override
    public String toString() {
        return "Square with side: " +
                super.getWidth();
    }
}
