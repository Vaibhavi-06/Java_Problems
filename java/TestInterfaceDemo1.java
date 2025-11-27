interface Shape{
 	void draw();
	void display();
	default void run(){

				System.out.println("Executing default method");
			}
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

class square implements Shape{

public void draw()
	{
		System.out.println("Drawing Square");
	}
public void display()
	{
		System.out.println("Show Square");
	}

}

class TestInterfaceDemo1
{
	public static void main(String args[])
	{
		Shape s=new circle();
		s.draw();
		s.display();

		Shape s1=new square();
		s1.draw();
	}

}