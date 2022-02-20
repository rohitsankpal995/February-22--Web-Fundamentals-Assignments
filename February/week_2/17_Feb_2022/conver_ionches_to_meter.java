package Feb_17_2022;

import java.io.*;

public class conver_ionches_to_meter {

	static double Conversion_Inches_to_meter(double Inches) {
		double meter;
		meter = Inches / 39.37;
		meter = Inches * 0.0254;// You have to use one formula for converting the value in Inches to the value
								// in meter.
		System.out.printf("Value in meter is: %.3f \n", meter);
		return 0;
	}

	public static void main(String args[]) {
		double Inches = 2.5;
		Conversion_Inches_to_meter(Inches);

	}

}
