package March_11_2022;

public class third_que {
	public static void main(String args[])
	{
		try
		{
			int value = 5;
			if(value<10)
			{
				throw new RuntimeException("value is less that 10");
			}
		}
		catch(RuntimeException re)
		{
			System.out.println(re.getMessage());
		}
		System.out.println("out side try block");
	}

}
