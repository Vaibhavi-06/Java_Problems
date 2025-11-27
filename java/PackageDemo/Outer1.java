class Outer1
{
	int a=50;

	public void display()
	{
		System.out.println("Value: "+a);

		class LocalInner
		{
			void show()
			{
				System.out.println("Method of Local Inner class");
			}
		}

		LocalInner l1=new LocalInner();
		l1.show();
	}

	
	
	public static void main(String args[])
	{
		Outer1 o=new Outer1();
		o.display();

		
	}
}