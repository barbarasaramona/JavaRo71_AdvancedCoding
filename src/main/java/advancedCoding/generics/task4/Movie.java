package advancedCoding.generics.task4;

public class Movie extends Media{

    private double boxOffice;
    public Movie(String info, Integer impact, double boxOffice) {
        super(info, impact);
        this.boxOffice = boxOffice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("boxOffice=").append(boxOffice);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
