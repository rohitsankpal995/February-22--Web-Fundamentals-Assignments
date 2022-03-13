package March_11_2022;

public class second_que {
	public static void main(String args[])
	{
		byte num;
		try
		{
			System.out.println("Scientech");
			num = Byte.parseByte("Easy");
			System.out.println("num "+num);
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
	}

}
	// => Compilation Error  <<<<<---

