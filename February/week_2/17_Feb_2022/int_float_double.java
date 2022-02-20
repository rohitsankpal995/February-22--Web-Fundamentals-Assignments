package Feb_17_2022;

import java.util.Scanner;

public class int_float_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int range = scan.nextInt();
		 * 
		 * for (int i=1; i<=range;i++) {
		 * 
		 * if(i%2==0) { System.out.println(i); } }
		 */

		Scanner scan = new Scanner(System.in);
		int a = 10;
		System.out.println("enter the input value ::" + a);
		int i = scan.nextInt();
		float j = scan.nextFloat();
		float product = i * j;
		System.out.println("this is the product:" + product);

	}

}
