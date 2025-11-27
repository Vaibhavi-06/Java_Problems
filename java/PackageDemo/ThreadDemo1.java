class ThreadDemo1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running...");
	}

	public static void main(String args[])
	/*{
		ThreadDemo1 t1=new ThreadDemo1();

		Thread t2=new Thread(t1);

		t2.start();
	}*/

	{
		Runnable r=new ThreadDemo1();

		Thread t2=new Thread(r,"My Thread1");

		t2.start();

		String s1=t2.getName();

		System.out.println(s1);
	}
}