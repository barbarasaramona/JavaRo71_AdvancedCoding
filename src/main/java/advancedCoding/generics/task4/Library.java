package advancedCoding.generics.task4;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    List<T> myLibrary;

    public Library(List<T> myLibrary) {
        this.myLibrary = myLibrary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Library{");
        sb.append("myLibrary=").append(myLibrary);
        sb.append('}');
        return sb.toString();
    }
}
