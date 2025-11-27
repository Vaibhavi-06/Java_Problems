class OverLoadDemo2
{

	int show(int id)
	{
		System.out.println("Welcome to Overloading:");
		return 0;
	}

	String show(int id)
	{
		System.out.println(" Welcome to Overloading");
		return null;
	}

	
	public static void main(String args[])
	{
		OverLoadDemo2 d1= new OverLoadDemo2();
		d1.show(10);
		d1.show("Rahul");
		
	}

}
