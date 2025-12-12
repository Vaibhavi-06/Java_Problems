import java.io.*;

class BufferedReaderDemo
{
	public static void main(String args[])
	{
		try{
			Reader r=new FileReader("output1.txt");
			BufferedReader br=new BufferedReader(r);

			int data;
			while((data=br.read())!=-1)
			{
				System.out.print((char)data);
				data=r.read();
			}
			br.close();
			r.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


