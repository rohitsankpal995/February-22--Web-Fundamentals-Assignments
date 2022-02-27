package Feb_21_2022;

public class First_7_term {
	//first 7 terms of N*6n where it is divisible by 6
	public static void main(String[] args) {
		int count = 0;
		
		for(int n=1;n<7;n++) {
			int exp = (n*(6*n));
			if(exp%6==0)
			System.out.println(exp);
			count++;
		
		}
		
	}

}
