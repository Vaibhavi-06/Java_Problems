class DaemonThreadDemo extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread Executed...");
		}
		else
		{
			System.out.println("User Thread Executed...");
		}
	}

	public static void main(String args[])
	{
		DaemonThreadDemo t1=new DaemonThreadDemo();
		DaemonThreadDemo t2=new DaemonThreadDemo();
		DaemonThreadDemo t3=new DaemonThreadDemo();

		t1.setDaemon(true);
	
		t1.start();
		t2.start();
		t3.start();

		System.out.println(Thread.currentThread().getName()+"Ends");
	}
}

//DaemonThread