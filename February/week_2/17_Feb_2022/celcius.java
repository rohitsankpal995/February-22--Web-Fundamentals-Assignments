package Feb_17_2022;

import java.util.Scanner;

public class celcius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 float Fahrenheit =scan.nextFloat();
		 float  Celsius;
		
		Celsius = ((Fahrenheit-32)*5)/9;
		System.out.println("Temperature in celsius is: "+Celsius);
		}

}
