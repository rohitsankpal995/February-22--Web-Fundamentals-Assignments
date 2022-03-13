package March_11_2022;

public class first_que {
	public static void main(String args[])
	{
		int x =10;
		int y=0;
		try
		{
			int z =x/y;
			System.out.print(z);
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
	}
}

