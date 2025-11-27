class PolyDemo
{
	void display()
	{
		System.out.println("Display Method get executed"); 
	}

	void display(int a)
	{
		System.out.println("Display Method get executed"+a); 
	}

	void display(String n)
	{
		System.out.println("Display Method get executed"+n); 
	}

	public static void main(String args[])
	{
		PolyDemo p1=new PolyDemo();
		p1.display();
		p1.display(10);
		p1.display("Ram");	
	}
}