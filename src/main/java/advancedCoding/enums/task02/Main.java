package advancedCoding.enums.task02;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(PackageSize.getPackageSize(15,40));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
