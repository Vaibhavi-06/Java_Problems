class Dog extends Animal
{
	Dog(String name)
	{
		super(name);
	}

	void makeSound()
	{
		System.out.println(name+" make sound as bhow");
	}

	public static void main(String args[])
	{
		Dog d1=new Dog("Dog");

		d1.eat();

		d1.makeSound();
	}
}