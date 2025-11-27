class Student1{

	int id;

	String name;

	double marks;

	public Student1(int i, String n, double m)
	{
		id=i;
		name=n;
		marks=m;
	}

	public void display()
	{
		System.out.println("ID: "+id+" Name: "+name+" Marks: "+marks);
	}

	public static void main(String args[])
	{
		Student1 d1=new Student1(101,"Shital",80.25);
		d1.display();
		Student1 d2=new Student1(102,"Vaibhavi",90.25);
		d2.display();
	}
}