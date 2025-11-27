class year{
	public static void main(String args[])
	{
		int year=2003;

		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{	
			System.out.println("Year is Leap Year");
		}
		else
		{	
			System.out.println("Year is not Leap Year");
		}
		System.out.println("Rest of the code...");
	}
}