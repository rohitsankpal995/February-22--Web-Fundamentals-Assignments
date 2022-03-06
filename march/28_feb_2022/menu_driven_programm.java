package Feb_28_2022;
import java.util.*;

public class menu_driven_programm {
	public static  int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public static  int diff(int a, int b) {
		int difference = a-b;
		return difference;
	}
	public static  int multiply(int a, int b) {
		int product = a*b;
		return product;
	}
	public static  int divide(int a, int b) {
		int quotient = a/b;
		return quotient;
	}
	public static  int average(int a, int b) {
		int sum = add(a,b);
		int avg = sum/2;
		return avg;
	}
	public static  int modulo(int a, int b) {
		int mod = a%b;
		return mod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter our choice : 1-Addition 2-Difference 3-multiplicatin 4-Divide 5-Average 6-Modulo");
		int choice = sc.nextInt();
		System.out.println("Enter first num");
		int a = sc.nextInt();
		System.out.println("Enter Second num");
		int b = sc.nextInt();
		if(choice>=1 && choice<=6) {
			switch(choice) {
				case 1 :
					int result = add(a,b);
					System.out.println("addition of "+a+ " and "+b+" is "+result );
					break;
				case 2:
					int result1 =diff(a,b);
					System.out.println("addition of "+a+ " and "+b+" is "+result1);
					break;
				case 3 :
					int result2 = multiply(a,b);
					System.out.println("addition of "+a+ " and "+b+" is "+result2 );
					break;
				case 4 :
					int result3 = divide(a,b);
					System.out.println("addition of "+a+ " and "+b+" is "+result3 );
					break;
				case 5 :
					int result4 = average(a,b);
					System.out.println("addition of "+a+ " and "+b+" is "+result4 );
					break;
				case 6 :
					int result5 = modulo(a,b);
					System.out.println("addition of "+a+ " and "+b+" is "+result5 );
					break;			
			}
		}
		else {
			System.out.println("Invalid input");
		}

	}

}
