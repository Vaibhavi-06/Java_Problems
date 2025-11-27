class ConMethod{

	public ConMethod()
	{
		this(10);
		System.out.println("Default Constructor");
	}

	public ConMethod(int id)
	{
		//this();
		System.out.println("Parameterized Constructor"+id);
	}

}
class TestConstructor{

public static void main(String args[])
{
	//ConMethod m1=new ConMethod(10);
	
	ConMethod m1=new ConMethod();

		
}

}