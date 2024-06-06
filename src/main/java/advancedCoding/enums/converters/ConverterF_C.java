package advancedCoding.enums.converters;

public class ConverterF_C implements Converter{
    @Override
    public float converter(float tempIn) {
        return (tempIn - 32f) / 1.8f;
    }
}
