package advancedCoding.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        SumInterface sumObj = new SumInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(sumObj.sum(2, 5));

    //-------------------------------------------------------------

        SumInterface sumObj2 = (x, y) -> x + y;
        System.out.println(sumObj2.sum(5, 5));

    //-------------------------------------------------------------

        List<String> listaOrase = Arrays.asList("Bucharest","Washington DC","Boston","Paris");
//        for (String x : listaOrase) {
//            System.out.println(x.toUpperCase());
//        }

//        for (int i = 0; i < listaOrase.size(); i++) {
//            listaOrase.set(i, listaOrase.get(i).toUpperCase());
//        }
//        System.out.println(listaOrase);

        System.out.println("\nFunction");
        Function<String, String> functionInt = (orash) -> orash.toUpperCase();
    //-------------------------------------------------------------
        Function<String, Integer> functionInt2 = (orash2) -> orash2.length();

    //-------------------------------------------------------------
//      System.out.println(listaOrase.stream().map(functionInt).collect(Collectors.toUnmodifiableList()));
        System.out.println(listaOrase.stream().map(functionInt2).collect(Collectors.toUnmodifiableList()));

    //-------------------------------------------------------------

        System.out.println(listaOrase.stream().map(o -> o.toUpperCase()).collect(Collectors.toUnmodifiableList()));

    //-------------------------------------------------------------
        System.out.println("\nPredicate");
        Predicate<String> predicateOrase = (orashPredicate) -> orashPredicate.startsWith("B");
        System.out.println(listaOrase.stream().filter(predicateOrase).toList());

    //-------------------------------------------------------------

        System.out.println(listaOrase.stream().map(ors -> ors.length() > 5 ? ors.toUpperCase() : ors).toList());

    }
}

