package March_02_2022;

public class even_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 11, 12, 13, 15, 18, 20, 12, 84,27 };
		int num = (arr.length);
		int index = 0;
		for (int i = 0; i < num; i++) {
			if (arr[i]%2 == 0) {
				System.out.println("Even No in given array are ::" +arr[i]);
			} 
		}
		

	}

}
