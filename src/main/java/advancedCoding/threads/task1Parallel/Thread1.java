package advancedCoding.threads.task1Parallel;

public class Thread1 implements Runnable{

    private int startInterval;
    private int endInterval;

    public Thread1(int startInterval, int endInterval) {
        this.startInterval = startInterval;
        this.endInterval = endInterval;
    }

    @Override
    public void run() {
        for (int i = startInterval; i <= endInterval; i++) {
            if (i % 2 == 0) {
                System.out.println("Thread1: " + i);
            }
        }
    }
}
