package Feb_18_And_19;

import java.util.Scanner;

public class Sum_of_digits_of_num {
	public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number ::");
	
	int n;
	int x;
	int num, sum = 0;


	n = sc.nextInt();

	while(n>0)
	{
		x = n%10;
		sum = sum + x;
		n = n/10 ;
		
	}

	System.out.println("Sum of digits oa a number: "+sum);
	}
}