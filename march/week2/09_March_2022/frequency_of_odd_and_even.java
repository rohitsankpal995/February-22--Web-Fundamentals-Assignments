package March_09_2022;

public class frequency_of_odd_and_even {

	public static void lower_traingular_matrix(int[][] arr,int r,int c) {
		int count =0 ;
		int count1 =0 ;
		int j;
		for(int i=0;i<r;i++) {
			for( j=0;j<c;j++) {
				if(arr[i][j]%2==0) {
					count++;
				}
				else if(arr[i][j]!=0) {
					count1++;
				}
			}
			
		}System.out.println( "Frequency of even no is "+count+" times" );
		System.out.println( "Frequency of odd no is "+count1+" times" );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2,3,8}, {4,5,6,7}, {7,9,8,5}, {5,4,3,10}};
		int r =arr.length;
		int c= arr[0].length;
		lower_traingular_matrix(arr,r,c);
	}
}

/*output::
 *	 Frequency of even no is 7 times
	Frequency of odd no is 9 times
*/
