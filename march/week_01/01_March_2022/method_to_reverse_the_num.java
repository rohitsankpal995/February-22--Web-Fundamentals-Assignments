package March_01_2022;
import java.util.*;
public class method_to_reverse_the_num {
	
	public static int revese_num(int a) {

		int rem = 0;
		int reversed = 0;
		while (a != 0) {

			rem = a % 10;
			a = a / 10;
			reversed = reversed * 10 + rem;
		}
		return reversed;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number::");
		int a = sc.nextInt();

		int reverse = revese_num(a);
		System.out.println("reverse of " + a + " is " + reverse);

	}

}
