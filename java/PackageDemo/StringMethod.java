class StringMethod
{
	public static void main(String args[])
	{
		String s1="fct";

		String s2="fct";

		String s3="FCTP";

		String s4=new String("FCTP");

		System.out.println("Both String are Equals: "+s1.equals(s2));

		System.out.println("Both String are Equals: "+s1.equals(s3));

		System.out.println("Both String are Equals: "+s3.equals(s4));

		System.out.println("To Upper Case: "+s1.toUpperCase());

		System.out.println("To Lower Case: "+s3.toLowerCase());

	}

}