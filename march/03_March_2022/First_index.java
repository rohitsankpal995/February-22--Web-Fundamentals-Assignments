package March_03_2022;
import java.util.*;
public class First_index {

	public static void main(String[] args) {
		// WAP to find first index at
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element of array::");
		int arr[] = { 10, 11, 12, 13, 15, 18, 0, 12, 11, 27 };
		int num = (arr.length);
		int index = 0;
		boolean is_found = false;
		int d = sc.nextInt();
		for (int i = 0; i < num; i++) {
			if(arr[i]==d) {
				is_found =true;
				index =i;
				break;
			}
		}
		if(is_found) {
			System.out.println("First index of element:: "+ index );
			
		}
	
	}

}
/*output 
*   13
	First index of element = 3
	
	12
	First index of element = 2
	
	11
	First index of element = 1
*
*
*
*
*
*

*/
