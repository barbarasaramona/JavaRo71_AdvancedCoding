package advancedCoding.enums.converters;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(TemperatureConvert.convertTemeperature('c', 'F', 100));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
