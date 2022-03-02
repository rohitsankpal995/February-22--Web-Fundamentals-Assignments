package Feb_25_2022;
import java.util.Scanner;
public class inverted_v_star_pattern {
			
			public static void main(String[] args) {
			
			Scanner cs = new Scanner(System.in); //Input
			
			System.out.println("Enter the row size:");
			
			int n = cs.nextInt();
			
			
			int sp = n;
			
			int st = n;
			
			for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j<= n * 2; j++) {
			
			if (j == sp || j == st) {
			
			System.out.print("*");
			
			} else {
			
			System.out.print(" ");
			
			}
			
			}
			
			sp--;
			
			st++;
			
			System.out.println();
			
			}
			
			
			
			}



}
