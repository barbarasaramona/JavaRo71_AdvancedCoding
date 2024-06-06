package advancedCoding.enums.converters;

public class ConverterK_C implements Converter{
    @Override
    public float converter(float tempIn) {
        return 273.15f - tempIn;
    }
}
