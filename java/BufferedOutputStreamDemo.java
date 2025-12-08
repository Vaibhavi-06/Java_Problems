import java.io.*;

class BufferedOutputStreamDemo{
	public static void main(String args[])
	{
		try{
		FileOutputStream fout=new FileOutputStream("C:\\github-projects\\Java_Problems\\java\\File Data\\test.txt");

		BufferedOutputStream bout=new BufferedOutputStream(fout);

		String s="Welcome to BufferedStream";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("File write Successful");
	}
}





//Q.write a difference between FileOutputStream and BufferedOutputStream?