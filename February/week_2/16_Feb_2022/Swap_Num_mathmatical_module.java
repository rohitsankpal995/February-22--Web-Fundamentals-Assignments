package Feb_16_1022;

import java.util.Scanner;

public class Swap_Num_mathmatical_module {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st num ::");
		int a = sc.nextInt();
		System.out.println("enter 2nd num ::");
		
		int b = sc.nextInt();
		System.out.println("before swaping ::"+a +" "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swaping ::"+a +" "+b);

	}


}
