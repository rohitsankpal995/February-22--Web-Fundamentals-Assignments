package March_10_2022;

public class Throw {
	public static void main(String[] args) {
		int i = 16;
		try {
			if (i < 18) {
				throw new ArithmeticException("not valid");
			} else {
				System.out.println("no errors");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
