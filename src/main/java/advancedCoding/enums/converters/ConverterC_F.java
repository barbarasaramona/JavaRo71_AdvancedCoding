package advancedCoding.enums.converters;

public class ConverterC_F implements Converter{

    @Override
    public float converter(float tempIn) {
        return tempIn * 1.8f + 32f;
    }
}
