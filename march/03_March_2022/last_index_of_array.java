package March_03_2022;

import java.util.*;

public class last_index_of_array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element of array::");
		int n = s.nextInt();
		int arr[] = { 10, 11, 12, 13, 15, 18, 0, 12, 11, 27  };
		lastIndex(arr, n);
	}

	static void lastIndex(int arr[], int n) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				index = i;
			}
		}
		System.out.println("Last Index Of Element = " + index);
	}
}
/*12
Last Index Of Element = 7

11
Last Index Of Element = 8

13
Last Index Of Element = 3
*/