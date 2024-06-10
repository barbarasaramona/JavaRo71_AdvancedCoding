package advancedCoding.generics;
import java.util.Arrays;

public class Sort {
    public static <T extends Comparable> void sortList (T[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j].compareTo(input[j + 1]) > 0) {
                    T auxVariable = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = auxVariable;
                }
            }
        }
        System.out.println("Array is: " + Arrays.toString(input));
    }
}
