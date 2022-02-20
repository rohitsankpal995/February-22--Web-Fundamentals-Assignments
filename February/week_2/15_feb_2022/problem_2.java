package Feb_15_2022;

public class problem_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int i=1;
		
		do 
		{
			int num= 3*i+2;
			
			if(num % 4 != 0) {
				System.out.println(num);
				count++;
				}
			i++;
		}while(count<5);

	}

}
