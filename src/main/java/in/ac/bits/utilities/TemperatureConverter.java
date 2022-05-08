package in.ac.bits.utilities;

/*
 * Author Nitin Srivastava
 */

public class TemperatureConverter {
		
	public static double fahrenhietTocelsius(double f) {
		double r=(f-32)*5/9;
		return  r;
	}
	public static double celsiusTofahrenhiet(double c) {
		return  ((9*c)/5)+32;
	}
	public static double fahrenhietToKelvin(double f) {
		return  (f-32) / 1.8 + 273.15;
	}
	public static double kelvinTofahrenhiet(double c) {
		double r=(c * 1.8) - 459.67;
		return  r;
	}
	
}
