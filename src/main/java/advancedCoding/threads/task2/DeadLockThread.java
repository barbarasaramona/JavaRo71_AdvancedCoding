package advancedCoding.threads.task2;

public class DeadLockThread {
    private static Object object1 = new Object();
    private static Object object2 = new Object();

    public static class Thread1 extends Thread { // Headache simulator // Bradăr ââââ
        @Override
        public void run() {
            synchronized (object1) {
                System.out.println("Object1 locked by thread1");
                System.out.println("Thread1 tries to lock object2.....-> inf");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (object2) {
                    for (int i = 0; i <100000; i++) {}
                    System.out.println("Thread1 locked object2");
                }
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (object2) {
                System.out.println("Thread2 locked object2");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread2 tries to lock object1....->inf");
                synchronized (object1) {
                    System.out.println("Thread2 locked object1");
                }
            }
        }
    }
}
