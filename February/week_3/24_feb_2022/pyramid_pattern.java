package FEb_24_2022;
import java.util.*;
public class pyramid_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		int sp = n-1;
		int st = 1;
		
		for(int i=1; i<=n;i++) {
			 
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			} 
			for(int j=1; j<=st;j++) {
		    	System.out.print(" *");
		    }
		  
		    if(i<=n-1) {
			sp--;
			st=st+1;
			
			}
		    System.out.println();
		  
		}
	}

}
