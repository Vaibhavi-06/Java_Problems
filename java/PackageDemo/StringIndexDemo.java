class StringIndexDemo
{
	public static void main(String args[])
	{
		String s1="Hello";

		System.out.println("Welcome to Exception Handling");

		try{
			System.out.println(s1.charAt(8));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Rest of the code of my program");
	}
}