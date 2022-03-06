package March_03_2022;

import java.util.*;

public class binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int binary = s.nextInt();
		int decimal = binToDeci(binary);
		System.out.println("binary to decimal = " + decimal);
	}

	static int binToDeci(int binary) {
		int deci = 0;
		int pow = 0;
		while (binary > 0) {
			deci += (binary % 10) * Math.pow(2, pow);
			pow++;
			binary /= 10;
		}
		return deci;

	}

}
