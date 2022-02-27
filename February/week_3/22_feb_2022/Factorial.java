package Feb_22_2022;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number ::");
		
			int a = scan.nextInt();
			int i = 1;
			int fact =1;
			while(i<=a)
		    	{
				fact = fact*i;
				i++;
		    	}
			System.out.println("Factorial of "+a+" is::"+fact);

	}

}
