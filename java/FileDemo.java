import java.io.File;

import java.io.IOException;

class FileDemo
{
	public static void main(String args[])
	{
		try{
			File f1=new File("C:\\github-projects\\Java_Problems\\java\\File Data\\sample.txt");

			if(f1.createNewFile())
			{
				System.out.println("File "+f1.getName()+" is created successfully");
			}
			else	
			{
				System.out.println("File already exists");
			}

			System.out.println("Path of file: "+ f1.getAbsolutePath());

			System.out.println("Do we have permission to read: "+ f1.canRead());

			System.out.println("Do we have permission to write: "+ f1.canWrite());

			System.out.println("Length of file is: "+ f1.length());

			if(f1.delete())
			{
				System.out.println("File "+f1.getName()+" is deleted successfully");
			}
			else	
			{
				System.out.println("Error occurred during deletion");
			}


		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
