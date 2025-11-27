class ArrayIndexDemo
{
	public static void main(String args[])
	{
		int[] numbers={1,2,3,4,5};

		System.out.println("Welcome to Exception Handling");

		try{
			numbers[10]=50;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("Rest of the code of my program");
	}
}