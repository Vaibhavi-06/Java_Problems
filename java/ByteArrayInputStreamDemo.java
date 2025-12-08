import java.io.*;

class ByteArrayInputStreamDemo{
	public static void main(String args[])
	{
		try{
		byte[] buf={35,36,37,38};

		ByteArrayInputStream bout=new ByteArrayInputStream(buf);
		
		int k=0;
	
		while((k=bout.read())!=-1)
		{
			char
		}

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