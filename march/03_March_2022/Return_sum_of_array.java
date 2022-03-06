package March_03_2022;

public class Return_sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 5, 6, 90, 8, 50 };
		int sum = sumArray(arr);
		System.out.println("sum of array = " + sum);
	}

	static int sumArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;

	}

}
