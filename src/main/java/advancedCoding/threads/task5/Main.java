package advancedCoding.threads.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Iterator<Integer> iterator = new Iterator<>(list);
//        // list[0]
//        iterator.next(); // sout list[0]
//        // list[1]
//        iterator.next(); // sout list[1]
//        // list[2]
//        iterator.prev(); // list[2] -> list[1] and sout list[1]
//        // list [1]


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i : list) {
                    iterator.next();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i : list) {
                    iterator.prev();
                }
            }
        });
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();



    }
}
