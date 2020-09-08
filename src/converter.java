import static java.lang.StrictMath.round;

public class converter {
    double data1 = 5;


    //fahrenheit-to-celcius converter
    public double converter(double data1) {
        double convertedToCelsius, fahrenheit;
        fahrenheit = data1;
        convertedToCelsius = round((fahrenheit - 32) * (0.5556));
        return convertedToCelsius;
    }


    //celcius-to-fahrenheit converter
    public double reverseConverter(double data1) {
        double convertedTofahrenheit, celcius;
        celcius = data1;
        convertedTofahrenheit = round((celcius * 9 / 5) + 32);
        return convertedTofahrenheit;
    }

    public String arabic_TO_roman_converter(double data1) {
        double convertedTofahrenheit, celcius;
        int[] decimalValue = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumeral = {
                "M",
                "CM",
                "D",
                "CD",
                "C",
                "XC",
                "L",
                "XL",
                "X",
                "IX",
                "V",
                "IV",
                "I"
        };
        String romanized = "";
        for (int index = 0; index < decimalValue.length; index++) {
            while (decimalValue[index] <= data1) {
                romanized += romanNumeral[index];
                data1 -= decimalValue[index];
            }
        }
        return romanized;
    }

}
