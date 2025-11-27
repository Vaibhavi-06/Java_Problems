class OverLoadDemo
{

	void show()
	{
		System.out.println("Welcome to Overloading");
	}

	void show(String name)
	{
		System.out.println(name+" Welcome to Overloading");
	}

	void show(String name, String city)
	{
		System.out.println(name+" Welcome to Overloading from "+city);
	}

	public static void main(String args[])
	{
		OverLoadDemo d1= new OverLoadDemo();
		d1.show();
		d1.show("Rahul");
		d1.show("Rahul","Mumbai");
	}

}