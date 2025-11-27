class ThreadDemo4 extends Thread
{
	public void run()
	{

		for(int i=0;i<5;i++)
		{
			try{
				Thread.sleep(500);
			}catch(Exception e)
			{
				System.out.println(e);
			}


		System.out.println(i);
		}
		
	}

	public static void main(String args[])
	{
		ThreadDemo4 t1=new ThreadDemo4();

		ThreadDemo4 t2=new ThreadDemo4();

		ThreadDemo4 t3=new ThreadDemo4();
		t1.start();
		t2.start();

		t3.start();
		
		try{
				t3.join();
			}catch(Exception e)
			{
				System.out.println(e);
			}


		
		
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
