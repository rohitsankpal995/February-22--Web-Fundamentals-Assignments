package March_01_2022;

import java.util.Scanner;

public class fibonacci_series {
	
	public static void fibonacci_series(int n) {
		int sum=0,count =0,a=0,b=1;
		
		while(count<n) {
			System.out.print(a+ " ");
			sum=a+b;
			a=b;
			b = sum;
			count++;
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number of terms of febonacci series ::");
		int n = sc.nextInt();

		 fibonacci_series(n);
		
	}

}
