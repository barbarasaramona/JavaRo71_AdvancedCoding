package advancedCoding.generics.task4;

public class Newspaper extends Media{

    private Integer readers;
    public Newspaper(String info, Integer impact, Integer readers) {
        super(info, impact);
        this.readers = readers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Newspaper{");
        sb.append("readers=").append(readers);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
