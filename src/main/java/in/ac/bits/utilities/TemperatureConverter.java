package in.ac.bits.utilities;

/*
 * Author Nitin Srivastava
 */

public class TemperatureConverter {
		
	public static double fahrenhietTocelsius(double f) {
		return  (f-32)*5/9;
	}
	public static double celsiusTofahrenhiet(double c) {
		return  ((9*c)/5)+32;
	}

}
