package advancedCoding.enums.converters;

public enum TemperatureConvert {
    //    C_F('c','f',new ConverterC_F()),
//    C_K('c','k', new ConverterC_K()),
//    K_C('k','c', new ConverterK_C()),
//    F_C('f','c', new ConverterF_C()),
//    F_K('f','k', new ConverterF_K()),
//    K_F('k','f', new ConverterK_F());
    C_F('c', 'f', new Converter() {
        @Override
        public float converter(float tempIn) {
            return tempIn * 1.8f + 32f;
        }
    }),
    C_K('c', 'k', new Converter() {
        @Override
        public float converter(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    K_C('k', 'c', new ConverterK_C()),
    F_C('f', 'c', new ConverterF_C()),
    F_K('f', 'k', new ConverterF_K()),
    K_F('k', 'f', new ConverterK_F());

    char inputTempUnit;
    char outputTemUnit;
    Converter converter;

    TemperatureConvert(char input, char output, Converter converter) {
        this.inputTempUnit = Character.toLowerCase(input);
        this.outputTemUnit = Character.toLowerCase(output);
        this.converter = converter;
    }


    public static float convertTemeperature(char input, char output, float temp) throws Exception {
        for (TemperatureConvert t : TemperatureConvert.values()) {
            if (t.inputTempUnit == Character.toLowerCase(input)
                    && t.outputTemUnit == Character.toLowerCase(output)) {
                return t.converter.converter(temp);
            }
        }
        throw new Exception("Combinatia de unitati nu exista!");
    }
}
