package advancedCoding.threads.task2;

public class Main {
    public static void main(String[] args) {
        DeadLockThread.Thread1 thread1 = new DeadLockThread.Thread1();
        DeadLockThread.Thread2 thread2 = new DeadLockThread.Thread2();

        thread1.start();
        try {
            thread1.join(); //Free my toy tool
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
