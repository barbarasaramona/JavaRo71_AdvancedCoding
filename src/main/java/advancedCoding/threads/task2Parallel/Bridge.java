package advancedCoding.threads.task2Parallel;

public class Bridge {

    public synchronized void driveThrough(Car car) {
        System.out.println(car + " is crossing!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(car + " has crossed!");
    }
}
