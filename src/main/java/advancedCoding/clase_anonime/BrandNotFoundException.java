package advancedCoding.clase_anonime;

public class BrandNotFoundException extends Exception{
    public BrandNotFoundException(String message) {
        super(message);
    }

    public BrandNotFoundException() {
        super("Brand not found");
    }
}
