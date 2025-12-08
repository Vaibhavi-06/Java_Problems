import java.io.*;

class BufferedInputStreamDemo{
	public static void main(String args[])
	{
		try{
		FileInputStream fin=new FileInputStream("C:\\github-projects\\Java_Problems\\java\\File Data\\test.txt");

		BufferedInputStream bin=new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
