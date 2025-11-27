class VaibhaviException extends Exception
{
	public VaibhaviException(String str)
	{
		super(str);
	}
}

public class CustomExceptionDemo
{
	public static void main(String args[])
	{
		try{
			throw new VaibhaviException("This is my Custom Exception");
		}
		catch(VaibhaviException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}

}