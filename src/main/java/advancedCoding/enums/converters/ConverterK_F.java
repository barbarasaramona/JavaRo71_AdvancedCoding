package advancedCoding.enums.converters;

public class ConverterK_F implements Converter{
    @Override
    public float converter(float tempIn) {
        return tempIn * 1.8f - 459.67f;
    }
}
