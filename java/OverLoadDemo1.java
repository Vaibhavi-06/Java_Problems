class OverLoadDemo1
{

	void show(int id)
	{
		System.out.println("Welcome to Overloading:");
	}

	void show(String id)
	{
		System.out.println(" Welcome to Overloading");
	}

	
	public static void main(String args[])
	{
		OverLoadDemo1 d1= new OverLoadDemo1();
		d1.show(10);
		d1.show("Rahul");
		
	}

}