package advancedCoding.enums.converters;

public class ConverterC_K implements Converter{

    @Override
    public float converter(float tempIn) {
        return tempIn + 273.15f;
    }
}
