package Feb_25_2022;

import java.util.Scanner;

public class half_Daimond_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		int sp = n/2;
		int st = 1;
		
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=st;j++) {
		    	System.out.print("*");
		    }
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			} 
		    if(i<n/2) {
			sp--;
			st=st+1;
		    }
		    else 
		    {
			sp++;
			st=st-1;
		    }
			
		    System.out.println();	
			
		}


	}

}
