package in.ac.bits.utilities;


/**
 * @author Ravi Rai
 */
public class UnitConverter {
    static double INCHES = 39.37;
    static double FEET = 3.28;
    static double MILES = 0.00062;
    static double MILLIMETERS = 1000;
    static double CENTIMETERS = 100;
    static double METERS = 1;
    static double KILOMETERS = 0.001;

    private double meters, converted;
    String fromUnit, toUnit;

    public UnitConverter(String afromUnit, String atoUnit) {
        fromUnit = afromUnit;
        toUnit = atoUnit;
    }

    // method to convert given value to meter
    public double toMeters(double val) {
        if (fromUnit.equals("in")) {
            meters = (val / INCHES);
        } else if (fromUnit.equals("ft")) {
            meters = (val / FEET);
        } else if (fromUnit.equals("mi")) {
            meters = (val / MILES);
        } else if (fromUnit.equals("mm")) {
            meters = (val / MILLIMETERS);
        } else if (fromUnit.equals("cm")) {
            meters = (val/ CENTIMETERS);
        } else if (fromUnit.equals("m")) {
            meters = (val / METERS);
        } else {
            meters = (val / KILOMETERS);
        }
        return meters;
    }

    // method to convert meter to required unit
    public double fromMeters(double meters) {
        if (toUnit.equals("in")) {
            converted = Math.round(INCHES * meters);
        } else if (toUnit.equals("ft")) {
            converted = Math.round(FEET * meters);
        } else if (toUnit.equals("mi")) {
            converted = Math.round(MILES * meters);
        } else if (toUnit.equals("mm")) {
            converted = Math.round(MILLIMETERS * meters);
        } else if (toUnit.equals("cm")) {
            converted = Math.round(CENTIMETERS * meters);
        } else if (toUnit.equals("m")) {
            converted = Math.round(METERS * meters);
        } else {
            converted = Math.round(KILOMETERS * meters);
        }
        return converted;
    }
}
