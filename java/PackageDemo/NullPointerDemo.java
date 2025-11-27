class NullPointerDemo
{
	public static void main(String args[])
	{
		String s=null;

		System.out.println("Welcome to Exception Handling");

		try{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Rest of the code of my program");
	}
}