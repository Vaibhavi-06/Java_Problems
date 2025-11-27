class FinalClassDemo1
{
	
	 void display()
	{
		System.out.println("Final method of parent class");		

	}
}

class FinalClassDemo extends FinalClassDemo1
{
	 void display()
	{
		System.out.println("Final method of child class");		

	}


	public static void main(String args[])
	{
		FinalClassDemo d1 = new FinalClassDemo();
		d1.display();
	}

}