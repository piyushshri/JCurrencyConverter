package in.ac.bits.utilities;

import java.util.Scanner;

/**
 * @author Ravi Rai
 */
public class UnitConversionCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Convert from:");
        String fromUnit = in.nextLine();


        System.out.println("Convert to: ");
        String toUnit = in.nextLine();
        UnitConverter unit = new UnitConverter(fromUnit, toUnit);
        System.out.println("Value:");
        double val = in.nextDouble();
        //convert to meter
        double meters = unit.toMeters(val);
        //convert meter to required unit
        double converted = unit.fromMeters(meters);

        System.out.println(val + " " + fromUnit + " = " + converted + " " + toUnit);
    }

}