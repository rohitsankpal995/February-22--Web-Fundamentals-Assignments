package March_03_2022;

public class Swap_no_by_passing_indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 15 };
		swapNums(arr);
	}

	static void swapNums(int arr[]) {
		arr[0] = arr[0] ^ arr[1];
		arr[1] = arr[0] ^ arr[1];
		arr[0] = arr[0] ^ arr[1];
		System.out.print("swapped array: { " + arr[0] + ", " + arr[1] + " }");
	}
}

//OUTPUT
/*
	swapped array: [ 15, 10 ]
*/
