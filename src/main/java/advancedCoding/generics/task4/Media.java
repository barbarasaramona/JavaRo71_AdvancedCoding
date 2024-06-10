package advancedCoding.generics.task4;

public abstract class Media {
    protected String info;
    protected Integer impact;

    public Media(String info, Integer impact) {
        this.info = info;
        this.impact = impact;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Media{");
        sb.append("info='").append(info).append('\'');
        sb.append(", impact=").append(impact);
        sb.append('}');
        return sb.toString();
    }
}
