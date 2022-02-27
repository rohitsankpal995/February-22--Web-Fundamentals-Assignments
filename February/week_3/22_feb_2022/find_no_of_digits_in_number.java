package Feb_22_2022;
import java.util.*;
public class find_no_of_digits_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ::");
		int a = sc.nextInt();
		
		int count = 0;
		while(a>0){
			count++;
			a=a/10 ;
			
		}
		System.out.println(count);

	}

}
