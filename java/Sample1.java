class Sample1
{
	void display(Sample1 obj)
	{
		System.out.println("Display Method Executed");
	}
	
	void show()
	{
		System.out.println("Show method Executed");

		display(this);
	}

	void info()
	{
		System.out.println("Info method Executed");

		display(this);
	}
	
	public static void main(String args[])
	{
		
        Sample1 s1 = new Sample1();
        s1.show();

        Sample1 s2 = new Sample1();
        s2.info();
  
  

		
	}

}