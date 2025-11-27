final class Constants
{
	final static double pi=3.14;
}

class Circle{
	
	int radius;

	public Circle(int radius)
	{
	this.radius=radius;
	}

	public void area()
	{
		double result=Constants.pi*radius*radius;
		System.out.println("Area of circle is: "+result);
	}

	public static void main(String args[])
	{
		Circle c1=new Circle(5);
		c1.area();
	}
}