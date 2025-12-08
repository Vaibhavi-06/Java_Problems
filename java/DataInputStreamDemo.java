import java.io.*;

class DataInputStreamDemo{
	public static void main(String args[])
	{
		try{
		FileInputStream fin=new FileInputStream("C:\\github-projects\\Java_Problems\\java\\File Data\\test.txt");

		DataInputStream din=new DataInputStream(fin);

		int count=fin.available();

		byte[] arr=new byte[count];
		
		din.read(arr);
		
		for(byte bt:arr)
		{
			char k=(char)bt;

			System.out.print(k+" ");
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//System.out.println("File write Successful");
	}
}
