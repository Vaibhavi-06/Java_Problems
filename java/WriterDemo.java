import java.io.*;

class WriterDemo
{
	public static void main(String args[])
	{
		try{
			Writer w=new FileWriter("output.txt");
			String content="I like to live in Mumbai\n";
			w.write(content);
			w.append("I like to travel in India");
			w.close();
			System.out.println("Write Successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//Q.Explore different methods of console class nd writer nd reader classes ,try to prepare their example using chatgpt?
//Q.CharArray(Reader/Writer)
//Filter(Reader/Writer)
//Piped(Reader/Writer))
//String(Reader/Writer))
//InputStreamReader
//OutputStreamReader