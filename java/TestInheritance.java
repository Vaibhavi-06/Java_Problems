class Employee
{
	int salary=40000;
	String company_name="FCTP";
}

class Programmer extends Employee
{

	int bonus=10000;
	String name="Shyam";
}

class TestInheritance
{
	public static void main(String args[])
	{
		Programmer p=new Programmer();
		System.out.println("Name: "+p.name+" Salary: "+p.salary+" Bouns: "+p.bonus+" Company: "+p.company_name);
	}
}