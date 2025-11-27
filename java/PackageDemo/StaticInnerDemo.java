class StaticInnerDemo
{
	static int data=100;

	static void display()
	{
	
	}

	static class Inner
	{
		void show()
		{
			System.out.println(data);

			display();
		}
	}

	public static void main(String args[])
	{
		StaticInnerDemo.Inner d1=new StaticInnerDemo.Inner();

		d1.show();
	}
}