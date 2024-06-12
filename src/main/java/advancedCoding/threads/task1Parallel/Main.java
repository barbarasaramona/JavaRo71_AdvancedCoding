package advancedCoding.threads.task1Parallel;

public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1(100, 200);
        new Thread(thread1).start();

        new Thread2(14300, 14800).start();
    }
}
