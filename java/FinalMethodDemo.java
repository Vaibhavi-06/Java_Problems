class FinalMethodDemo1
{
	
	final void display()
	{
		System.out.println("Final method of parent class");		

	}
}

class FinalMethodDemo extends FinalMethodDemo1
{
	 void display()
	{
		System.out.println("Final method of child class");		

	}


	public static void main(String args[])
	{
		FinalMethodDemo d1 = new FinalMethodDemo();
		d1.display();
	}

}