import java.io.*;

class ByteArrayOutputStreamDemo{
	public static void main(String args[])
	{
		try{
		FileOutputStream fout1=new FileOutputStream("C:\\github-projects\\Java_Problems\\java\\File Data\\test1.txt");
		FileOutputStream fout2=new FileOutputStream("C:\\github-projects\\Java_Problems\\java\\File Data\\test2.txt");
		FileOutputStream fout3=new FileOutputStream("C:\\github-projects\\Java_Problems\\java\\File Data\\test3.txt");

		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		bout.write(65);

		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.writeTo(fout3);

		bout.flush();
		bout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Successful....write");
	}
}
