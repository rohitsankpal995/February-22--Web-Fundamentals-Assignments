package Feb_22_2022;
import java.util.*;
public class Factorial_of_no_whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do u want to run this program");
		Scanner scan= new Scanner(System.in);
		String ans = scan.nextLine();
		if(ans =="yes") {
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
		else {
			System.out.println("invalid input");
		}
	}

}
