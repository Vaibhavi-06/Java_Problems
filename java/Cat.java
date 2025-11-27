class Cat extends Animal
{
	Cat(String name)
	{
		super(name);
	}

	void makeSound()
	{
		System.out.println(name+" make sound as meow");
	}

	public static void main(String args[])
	{
		Cat c1=new Cat("Cat");

		c1.eat();

		c1.makeSound();
	}
}