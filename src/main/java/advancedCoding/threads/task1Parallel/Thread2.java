package advancedCoding.threads.task1Parallel;

public class Thread2 extends Thread{

    private int startInterval;
    private int endInterval;

    public Thread2(int startInterval, int endInterval) {
        this.startInterval = startInterval;
        this.endInterval = endInterval;
    }

    @Override
    public void run() {
        for (int i = startInterval; i <= endInterval; i++) {
            if (i % 2 == 0) {
                System.out.println("Thread2: " + i);
            }
        }
    }
}
