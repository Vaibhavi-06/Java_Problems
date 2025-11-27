class concat
{
	public static void main(String args[])
	{
		String s1="Hello";

		String s2="Vaibhavi";

		//s1.concat(s2);

		System.out.println(s1.concat(s2)); //standard method

		String s3=s1+ s2;//using + operator

		System.out.println(s3);

		System.out.println("Length of String: "+s3.length());

		System.out.println("Character At: "+s3.charAt(4));

		System.out.println("SubString: "+s3.substring(5,13));

		System.out.println("SubString: "+s3.substring(5));//Starting index and return data till end of string	
	}
	
}