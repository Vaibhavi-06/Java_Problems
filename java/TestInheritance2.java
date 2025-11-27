class Employee
{
	int salary=40000;
	String company_name="FCTP";
}

class Programmer extends Employee
{

	int bonus=10000;
	String name="Shyam";
	String skill="Java";
}

class Tester extends Employee
{
	int bonus=5000;
	String name="Gokul";
	String skill="Selenium";
}

class TestInheritance2
{
	public static void main(String args[])
	{
		Tester p=new Tester();
		System.out.println("Name: "+p.name+" Salary: "+p.salary+" Bouns: "+p.bonus+" Company: "+p.company_name+" Skill: "+p.skill);

		Programmer p1=new Programmer();
		System.out.println("Name: "+p1.name+" Salary: "+p1.salary+" Bouns: "+p1.bonus+" Company: "+p1.company_name+" Skill: "+p1.skill);
	}
}