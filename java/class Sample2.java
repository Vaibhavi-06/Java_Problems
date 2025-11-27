class Sample2
{
	int id;
 
	String name;
 
	public Sample2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
 
	void display(Sample2 obj)
	{
		System.out.println("Display Method Executed");
 
		System.out.println("Id: "+id+" Name: "+name);
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
		Sample2 s1=new Sample2(101,"Rahul");
 
		s1.show();
 
		Sample2 s2=new Sample2(102,"Sarika");
 
		s2.info();
	}
 
 
}