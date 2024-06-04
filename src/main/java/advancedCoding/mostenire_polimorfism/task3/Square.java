package advancedCoding.mostenire_polimorfism.task3;

public class Square extends Rectangle{
    public Square(String color, boolean isColored, double side) {
        super(color, isColored, side, side);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square with side: ");
        sb.append(super.getWidth());
        return sb.toString();
    }
}
