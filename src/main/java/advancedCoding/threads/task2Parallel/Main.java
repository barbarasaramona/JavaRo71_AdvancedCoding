package advancedCoding.threads.task2Parallel;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Masina1", "SUV");
        Car car2 = new Car("Masina2", "LUX");

        Bridge bridge = new Bridge();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car1);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car2);
            }
        });
        thread1.start();
        thread2.start();
    }
}
