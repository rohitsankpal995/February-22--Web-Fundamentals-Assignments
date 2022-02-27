package Feb_21_2022;
import java.util.*;
public class Divisible_by_2_and_8_but_not_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");

		int i = sc.nextInt();
		boolean num = ((i%2==0)&&(i%8==0)&&(i%6!=0));
		System.out.println(num);

	}

}
