package March_09_2022;

public class sparse_matrix {
	public static void Sparse_matrix(int[][] arr,int r,int c) {
		int j;
		int n = r*c;
		int count =0;
		for(int i=0;i<r;i++) {
			for( j=0;j<c;j++) {
				if(arr[i][j]==0) {
					count++;
				}	
			}	
		}
		if(count>n/2) {
			System.out.println("Given Matrix is sparse matrix");
		}else {
			System.out.println("Given Matrix is not sparse matrix");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,0,0,1}, {0,0,6,0}, {0,0,0,5}, {5,0,3,0}};
		int r =arr.length;
		int c= arr[0].length;
		Sparse_matrix(arr,r,c);
		
	}

}
