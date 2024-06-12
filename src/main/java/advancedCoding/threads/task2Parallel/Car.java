package advancedCoding.threads.task2Parallel;

public class Car {
    String name;
    String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
