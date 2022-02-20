package Feb_15_2022;

public class problem_1 {
	public static void main(String args[]) {
		int i = 1;
		int c = 0;

		for (i = 1; c <= 5; i++) {

			int num = ((3 * i) + 2);

			if (num % 4 != 0) {

				System.out.println(num);
				c++;
			}

		}
	}
}
