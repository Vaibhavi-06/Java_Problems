class Outer
{
	int a=50;

	public void display()
	{
		System.out.println("Value: "+a);
	}

	class Inner
	{
		void show()
		{
			System.out.println("Method of Inner class");
		}
	}
	
	public static void main(String args[])
	{
		Outer o=new Outer();
		o.display();

		Outer.Inner in=o.new Inner();

		in.show();
	}
}