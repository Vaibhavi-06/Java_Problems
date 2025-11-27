class Truck
{
	int speed;
	
	public Truck()
	{
		System.out.println("Speed of truck is: "+speed);
	
		System.out.println("Constructor Executed...");
	}

	{
		speed=50;

		System.out.println("Instance initializer block executed...");
	}
	
	public static void main(String args[])
	{
		Truck t1=new Truck();
		Truck t2=new Truck();
	}
}