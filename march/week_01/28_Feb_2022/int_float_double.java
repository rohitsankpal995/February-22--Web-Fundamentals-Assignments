package Feb_28_2022;

import java.util.Scanner;

public class int_float_double {
	public static int multiplication(int a, int b) {
		int product = a*b;
		return product;
	}
	
	public static float multiplication(float a,float b) {
		float product = a*b;
		return product;
	}
	
	public static double multiplication( double a, double b) {
		double product = a*b;
		return product;
	}
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice: 1:int 2:float 3:double ");
			int choice = sc.nextInt();
		
			
			if( choice>=1 && choice<=3) {
				
				switch(choice) {
					case 1 :
						System.out.println("Enter first num");
						int a = sc.nextInt();
						System.out.println("Enter Second num");
						int b = sc.nextInt();

						int result = multiplication(a,b);
						System.out.println("multiplication is "+result);
						
						break;
					case 2 :
						System.out.println("Enter first num");
						float a1 = sc.nextFloat();
						System.out.println("Enter Second num");
						float b1 =  sc.nextFloat();
						float result1 = multiplication(a1,b1);
						System.out.println("multiplication is "+result1);
						break;
					case 3 :
						System.out.println("Enter first num");
						double n1 = sc.nextDouble();
						System.out.println("Enter Second num");
						double n2 = sc.nextDouble();
						 
						double result2 =  multiplication(n1,n2);
						System.out.println("multiplication is "+result2);
						break;	
				}
				
			}
			else {
				System.out.println("Invalid choice");
			}
		}
}
