class CatchBlock
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Exception Handling");
	
	try{
		int[] a = new int[5];

		a[4]=30/5;

		String s=null;

		System.out.println(s.length());
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	System.out.println("Rest of the code of my program");

	}

}