class TestFinally
{
	public static void main(String[] args) 
	{
		try
		{
			int data=25/5;
	System.out.println(data);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		finally 
			{
		 System.out.println("finally block is always executed");
		}

	      System.out.println("Rest of the code");
	}
}
