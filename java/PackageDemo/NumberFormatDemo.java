class NumberFormatDemo
{
	public static void main(String args[])
	{
		String s="Vaibhavi";

		System.out.println("Welcome to Exception Handling");

		try{
			int no=Integer.parseInt(s);

			System.out.println(no);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Rest of the code of my program");
	}
}