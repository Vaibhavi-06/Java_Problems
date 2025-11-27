import java.io.*;

class ThrowsDemo
{
	void display() throws IOException
	{
		System.out.println("Throws Example");
	}
}

class ThrowsTest
{
	public static void main(String args[])
	{
		ThrowsDemo d1=new ThrowsDemo();
		try
		{
			d1.display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
