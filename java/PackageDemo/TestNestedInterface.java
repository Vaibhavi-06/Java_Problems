interface A
{
	void show();

	interface B{
		void msg();
	}
}

class TestNestedInterface implements A.B
{
	public void msg()
	{
		System.out.println("Overriding method of nested interface");
	}

	public static void main(String args[])
	{
		A.B obj1=new TestNestedInterface();
		
		obj1.msg();
	}
}