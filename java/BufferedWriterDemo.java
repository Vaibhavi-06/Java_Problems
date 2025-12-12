import java.io.*;

class BufferedWriterDemo
{
	public static void main(String args[])
	{
		try{
			Writer w=new FileWriter("output1.txt");
			BufferedWriter bw=new BufferedWriter(w);
			String content="I like to live in Mumbai\n";
			bw.write(content);
			
			bw.close();
			System.out.println("Write Successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

