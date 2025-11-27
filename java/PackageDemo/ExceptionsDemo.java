class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

class ExceptionsDemo
{
	public static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Invalid Voting Age,age must be greater 18");
		}
		else
		{
			System.out.println("Valid Voting Age");
		}
	}


	public static void main(String args[])
	{
		try{
			validate(15);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}

}