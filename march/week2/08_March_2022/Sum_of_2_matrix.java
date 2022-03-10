package March_08_2022;

import java.util.Scanner;

public class Sum_of_2_matrix {

	
	public static void DisplaywoDArray(int[][] arr,int r,int c, int[][]arr2 ) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+ arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int [][] arr = {{20,11,55,80}, {10,11,20,25}, {11,20,15,11}, {20,11,55,80}};
		int [][] arr2 ={{11,12,16,18}, {10,11,20,25}, {11,20,15,11}, {37,15,10,16}};
		int r =arr.length;
		int c= arr[0].length;
		System.out.println("Sum of two matrix is::");
		DisplaywoDArray(arr,r,c,arr2);

	}

}
/*Output::
 * Sum of two matrix is::
	31 23 71 98 
	20 22 40 50 
	22 40 30 22 
	57 26 65 96
*/
