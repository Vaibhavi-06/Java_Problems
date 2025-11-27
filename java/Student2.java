class Student2{

	int id;

	String name;

	double marks;

	public Student2(int id, String name, double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public void display()
	{
		System.out.println("ID: "+id+" Name: "+name+" Marks: "+marks);
	}

	public static void main(String args[])
	{
		Student2 d1=new Student2(101,"Shital",80.25);
		d1.display();
		Student2 d2=new Student2(102,"Vaibhavi",90.25);
		d2.display();
	}
}