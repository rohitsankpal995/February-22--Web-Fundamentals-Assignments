package March_07_2022;
import java.util.Scanner;
public class Swap_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println("Strings before swap: a = " + a + " and b = " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("Strings after swap: a = " + a + " and b = " + b);
	}

}
