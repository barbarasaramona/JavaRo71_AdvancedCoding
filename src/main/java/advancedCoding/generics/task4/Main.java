package advancedCoding.generics.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Book book1 = new Book("dumnezeu", 100, "eu");
        Book book2 = new Book("dumnezeu2", 500, "tu");

        Movie movie1 = new Movie("Inception", 1000, 250.00);
        Movie movie2 = new Movie("Interstellar", 1250, 3000.00);


        Library<Book> books = new Library<>(Arrays.asList(book1, book2));
        System.out.println(books);

        Library<Media> movies = new Library<>(Arrays.asList(movie1, movie2));
        Library<Media> movies2 = new Library<>(Arrays.asList(movie1, book1));
        System.out.println(movies);
        System.out.println(movies2);
    }
}
