package Feb_18_And_19;
import java.util.Scanner;

public class Fahrenheit_to_celsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 float Fahrenheit =scan.nextFloat();
		 float  Celsius;
		
		Celsius = ((Fahrenheit-32)*5)/9;
		System.out.println("Temperature in celsius is: "+Celsius);
		}

	

}
