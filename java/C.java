class A
{
	int id=100;
}

class B
{
	String name="Vrushabh";
}

class C extends A
{
	String city="pune";

	void display()
	{
		System.out.println("Id: "+id+" Name: "+name+" City: "+city);
	}

	public static void main(String args[])
	{
		C c1=new C();
	
		c1.display();
	}
}