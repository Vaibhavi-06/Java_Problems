interface A
{
	int id=100;
}

interface B
{
	String name="Vrushabh";
}


class C2 implements A,B
{
	String city="pune";

	public void display()
	{
		System.out.println("Id: "+id+" Name: "+name+" City: "+city);
	}
}