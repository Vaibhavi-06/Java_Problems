import java.io.FileOutputStream;

public class FileOutputStreamTest
{
 	public static void main(String args[])
	{
		try{
			FileOutputStream fs=new FileOutputStream("C:\\java\\File Data\\test.txt");
			String s="Welcome IO Programming";
			byte b[]=s.getBytes();
			fs.write(b);
			fs.close();
			System.out.println("Success....");

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}