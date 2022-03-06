package March_02_2022;

public class Count_of_even_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 11, 12, 13, 15, 18, 59, 12, 84,27 };
		int num = (arr.length);
		int count =0 ;
		for (int i = 0; i < num; i++) {
			if (arr[i]%2 == 0) {
				count ++ ;
			} 
		}
		
		System.out.println(" count of Even No in given array is ::" +count);
	}

}



