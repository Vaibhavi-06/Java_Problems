class Parent
{
	String message="Happy Diwali";

	void eat()
	{
		System.out.println("I am eating Diwali Sweets");

	}
}

class SuperDemo extends Parent{

	String message="Everyone";

	void eat()
	{
		super.eat();

		System.out.println("I Like homemade Sweets");

	}


	void showMessage()
	{
		System.out.println(super.message);
		System.out.println(message);

	}

	public static void main(String args[])
	{
		SuperDemo d1=new SuperDemo();
		d1.showMessage();
		d1.eat();
	}
}