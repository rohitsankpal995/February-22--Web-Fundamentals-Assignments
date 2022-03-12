package March_01_2022;

import java.util.Scanner;

public class swap {

	public static void swap_numbers(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swaping ::" + a + " " + b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st num ::");
		int a = sc.nextInt();
		System.out.println("enter 2nd num ::");
		int b = sc.nextInt();
		System.out.println("before swaping ::" + a + " " + b);
		swap_numbers(a, b);
	}

}
