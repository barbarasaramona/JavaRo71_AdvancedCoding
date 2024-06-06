package advancedCoding.enums.converters;

public class ConverterF_K implements Converter{

    @Override
    public float converter(float tempIn) {
        return (tempIn + 459.67f) / (9/5f);
    }
}
