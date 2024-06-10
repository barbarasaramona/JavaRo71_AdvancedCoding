package advancedCoding.generics.task4;

public class Book extends Media{

    private String author;

    public Book(String info, Integer impact, String author) {
        super(info, impact);
        this.author = author;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("author='").append(author).append('\'');
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
