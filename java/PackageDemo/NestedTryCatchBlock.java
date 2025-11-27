class NestedTryCatchBlock
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Exception Handling");
	
	try{
		int[] a = new int[5];

		try{

			a[7]=30/5;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}


		String s=null;

		System.out.println(s.length());
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}

	System.out.println("Rest of the code of my program");

	}

}