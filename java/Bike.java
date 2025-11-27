class Vehical
{

	protected int run()
	{
		System.out.println("Hello from Parent class method");
		return 0;
	}
}

class Bike extends Vehical{

	public int run()
	{
		System.out.println("Hello from Child class method");
		return 0;
	}

	public static void main(String args[])
	{
		Bike v1=new Bike();
		v1.run();
	}
}