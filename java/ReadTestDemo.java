import java.io.*;

class ReadTestDemo
{
	public static void main(String args[])
	{
		try{
			File f1=new File("C:\\github-projects\\Java_Problems\\java\\File Data\\sample.txt");

			/*if(f1.createNewFile())
			{
				System.out.println(f1.getName()+"File created successfully");
			}
			else
			{
				System.out.println(f1.getName()+"File already exists");
			}

			System.out.println("Is file readable: "+f1.canRead());
			System.out.println("Is file writable: "+f1.canWrite());
			System.out.println("Is file executable: "+f1.canExecute());*/
	
			f1.setReadable(true);
			f1.setWritable(true);
			f1.setExecutable(true);

			System.out.println("Is file readable: "+f1.canRead());
			System.out.println("Is file writable: "+f1.canWrite());
			System.out.println("Is file executable: "+f1.canExecute());

			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}