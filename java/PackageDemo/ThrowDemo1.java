import java.io.*;

class ThrowDemo1
{
	public static void show()throws FileNotFoundException
	{
		FileReader fr=new FileReader("C:\\user\\desktop\\abc.txt");

		throw new FileNotFoundException();
	}
	
	public static void main(String args[])
	{

		try{
			show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}