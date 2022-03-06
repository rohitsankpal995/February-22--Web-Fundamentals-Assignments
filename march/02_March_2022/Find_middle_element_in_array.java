package March_02_2022;

import java.util.Scanner;

public class Find_middle_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 11, 12, 13, 15, 18, 20, 12, 84 };
		int num = (arr.length) / 2;
		int index = 0;
		
		for (int i = 0; i <= num; i++) {
			if (i == num) {
				System.out.println(arr[i]);
			} 
		}
	}

}
