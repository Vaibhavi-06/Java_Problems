//static synchronized 

class PrintDetails
{
	public static synchronized  void printMessage(String s)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good Night...");

			System.out.println(s);

			try{
				Thread.sleep(400);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	}
}

class MyThread1 extends Thread
{
	PrintDetails d;

	String s;
		
	MyThread1(PrintDetails d, String s)
	{
		this.d=d;

		this.s=s;
	}

	public void run()
	{
		d.printMessage(s);
	}
} 

public class TestPrint
{
	public static void main(String args[])
	{
		PrintDetails obj1=new PrintDetails();

		PrintDetails obj2=new PrintDetails();


		MyThread1 t1=new MyThread1(obj1,"Sachin");

		MyThread1 t2=new MyThread1(obj2,"Saurav");

		t1.start();

		t2.start();

	}
}