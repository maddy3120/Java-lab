class Exception
{
	public static void main(String args[])
	{
	
		try
		{
			int a=10,b=0;
			int c=a/b;
			System.out.println("Answer is "+ c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Execution ends here");
		}
	}
}
