import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fahrenheit_to_celcius_converterTest {

    @Test
    public void F_To_C_test() {
        converter tester = new converter(); // MyClass is tested
        double fehrenhiet = 41;
        double converted_fahrenheit = 5;
        double result = tester.converter(fehrenhiet);
        assertEquals(converted_fahrenheit,result);

    }

    @Test
    public void C_To_F_test() {
        converter tester = new converter(); // MyClass is tested
        double c = 5;
        double converted_f = 41;
        double result = tester.reverseConverter(c);
        assertEquals(converted_f,result);

    }

    @Test
    public void arabic_TO_roman_test() {
        converter tester = new converter(); // MyClass is tested
        double a = 4;
        String converted_r = "IV";
        String result = tester.arabic_TO_roman_converter(a);
        assertEquals(converted_r,result);

    }
}