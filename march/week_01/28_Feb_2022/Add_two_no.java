package Feb_28_2022;
import java.util.*;
public class Add_two_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		int add =adding(a,b);
		System.out.println("Sum is"+add);
	}
	public static int adding(int a,int b) {
		int sum = a+b ;
		return sum;
	}
}
