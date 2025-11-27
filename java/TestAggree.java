class Address
{
	String city,state,country;

	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;	
	}
}

class Employee
{
	int empid;
	String empname;
	Address eaddress;

	Employee(int empid,String empname,Address eaddress)
	{
		this.empid=empid;
		this.empname=empname;
		this.eaddress=eaddress;
	}

	void display()
	{
		System.out.println(empid+" "+empname);
		System.out.println(eaddress.city+" "+eaddress.state+" "+eaddress.country);
	}
}

class TestAggree
{
	public static void main(String args[])
	{
		Address a1=new Address("Pune","Maharashtra","India");
		Employee e1=new Employee(101,"Keshav",a1);
		e1.display();
	}
}