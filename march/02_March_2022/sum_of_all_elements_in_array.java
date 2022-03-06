package March_02_2022;

public class sum_of_all_elements_in_array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks = {10,15,23,40,55,12,52,74,36,95};
		int n = marks.length;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum= sum+ marks[i];
			
		}System.out.print("Sum of all elements of array is :: "+sum);
	}

}
