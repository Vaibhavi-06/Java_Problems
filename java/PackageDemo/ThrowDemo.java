class ThrowDemo
{
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new NullPointerException("This person is not allowed to vote");
		}
		else
		{
			System.out.println("Valid Voting Age");
		}
	}
	
	public static void main(String args[])
	{

		try{
			validate(14);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}