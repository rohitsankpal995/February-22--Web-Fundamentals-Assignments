package Feb_22_2022;
import java.util.*;

public class odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to check odd or even::");
		int n = sc.nextInt();
		String output = " ";
		output = (n%2==0)? ("Even"):("Odd");
		System.out.println(output);
		

	}

}
