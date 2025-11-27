class MethodDemo2{

	public void display()
	{
		System.out.println("This my userdefine normal method");
	}
	
	static void goOut()
	{
		System.out.println("This my userdefine static method");
	}

	public static void main(String args[])
	{
		MethodDemo2 m1=new MethodDemo2();
		m1.display();

		goOut();
	}


}