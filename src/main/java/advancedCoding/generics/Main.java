package advancedCoding.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] intergerArray = {1,6,2,8,4,3,8,3,2,6,7,7,123,163,642,123};
        Character[] charArray = {'b','y','h','v','n','k','q','w','a','c'};
        String[] cuvinteArray = {"Acasa", "Acasa2", "Masina", "Caine", "Abc","aBC","abC"};



        Sort.sortList(intergerArray);
        Sort.sortList(charArray);
        Sort.sortList(cuvinteArray);

        List<Integer> listInteger= Arrays.asList(3,2,1);
        List<Integer> sortedList = listInteger.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
