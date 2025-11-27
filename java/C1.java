interface A
{
	int id=100;
}

interface B
{
	String name="Vrushabh";
}

interface D
{
	String color="White";
}

class C1 implements A,B,D
{
	String city="pune";

	void display()
	{
		System.out.println("Id: "+id+" Name: "+name+" City: "+city+" Color: "+color);
	}

	public static void main(String args[])
	{
		C1 c2=new C1();
	
		c2.display();
	}
} 