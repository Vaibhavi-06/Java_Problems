interface A 
{
	 void run();
}

class TestAnonymous1
{
	public static void main(String args[])
	{
		A a1=new A()
		{
			public void run()
			{
				System.out.println("Anonymous Class");
			}
		};

		a1.run();
	}
}
