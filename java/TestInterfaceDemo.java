interface Shape{

	void draw();
	void display();
}

class circle implements Shape{

	public void draw()
	{
		System.out.println("Drawing Circle");
	}

	public void display()
	{
		System.out.println("Show Circle");
	}

}

class TestInterfaceDemo
{
	public static void main(String args[])
	{
		Shape s=new circle();
		s.draw();
		s.display();
	}

}