import java.io.*;

class DataOutputStreamDemo{
	public static void main(String args[])
	{
		try{
		FileOutputStream fout=new FileOutputStream("C:\\github-projects\\Java_Problems\\java\\File Data\\test.txt");

		DataOutputStream dout=new DataOutputStream(fout);

		
		dout.writeInt(65);
		dout.flush();
		dout.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("File write Successful");
	}
}
