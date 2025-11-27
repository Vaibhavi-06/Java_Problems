class StaticMethodDemo{

	int emp_id=10;

	String ename="Chakuli";

	static  String cname="FCTP";

	StaticMethodDemo(int emp_id,String ename)
	{
		this.emp_id=emp_id;
		this.ename=ename;
	}
	
	static void change()
	{
		emp_id=103;
		ename="Chakuli";
		cname="FCTS";
	}

	void show()
	{
	
	//cname="FCTB";
	System.out.println("Emp ID: "+emp_id+" Emp Name: "+ename+" Company Name: "+cname);
	}

	public static void main(String args[])
	{
		StaticMethodDemo d1=new StaticMethodDemo(101,"Shubham");
		StaticMethodDemo d2=new StaticMethodDemo(102,"Vaibhavi");

		change();

		d1.show();
		d2.show();

	}
	

}