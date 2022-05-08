package in.ac.bits.utilities;

import org.junit.jupiter.api.Test;
/*
 * Author Nitin Srivastava
 */
public class TemperaturConverterTest {

    @Test
    public void fToC() {
        double converted =TemperatureConverter.fahrenhietTocelsius(98.6);
        assert(converted == 37);
    }
    
    @Test
    public void CToF() {
        double converted =TemperatureConverter.celsiusTofahrenhiet(38);
        assert(converted == 100.4);
    }
    
    @Test
    public void fToK() {
        double converted =TemperatureConverter.fahrenhietToKelvin(98.6);
        assert(converted == 310.15);
    }
}
