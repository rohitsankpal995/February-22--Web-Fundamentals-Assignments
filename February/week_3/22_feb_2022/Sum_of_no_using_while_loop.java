package Feb_22_2022;
import java.util.*;
public class Sum_of_no_using_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no::");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=n) {
			
			sum= sum+i;
			i++;
		}System.out.println(sum);

	}

}
