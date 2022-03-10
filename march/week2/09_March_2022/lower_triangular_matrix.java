package March_09_2022;

public class lower_triangular_matrix {
	
	public static void lower_traingular_matrix(int[][] arr,int r,int c) {
		int j;
		for(int i=0;i<r;i++) {
			for( j=0;j<c;j++) {
				if(j>i) {
					arr[i][j]=0;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2,3,1}, {4,5,6,7}, {7,9,8,5}, {5,4,3,1}};
		int r =arr.length;
		int c= arr[0].length;
		System.out.println("Lower Traingular Matrix is::");
		lower_traingular_matrix(arr,r,c);
	}

}
/*output::
		Lower Traingular Matrix is::
		1 0 0 0 
		4 5 0 0 
		7 9 8 0 
		5 4 3 1 
*/