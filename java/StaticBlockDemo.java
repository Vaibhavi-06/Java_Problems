class StaticBlockDemo{

	int a;		
	static int b;

	StaticBlockDemo()
	{
	
	}

	//static{System.out.println("Static block executes...");}

	void show()
	{
		System.out.println("a: "+a+" b: "+b);
	}

	public static void main(String args[])
	{
		System.out.println("Main method executes...");
		StaticBlockDemo s1=new StaticBlockDemo();
		s1.show();
	}
}
