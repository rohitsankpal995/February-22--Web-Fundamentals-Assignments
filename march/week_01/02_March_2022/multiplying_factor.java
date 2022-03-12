package March_02_2022;

public class multiplying_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 11, 12, 13, 15, 18, 59, 12, 84, 27 };
		int num = (arr.length);
		int[] arr2 = new int[num];
		int mf = 4;
		for (int i = 0; i < num; i++) {
			arr2[i] = arr[i] * mf;
			System.out.print(arr2[i]+" ");
		}
	}

}
