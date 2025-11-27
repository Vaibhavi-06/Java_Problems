class TestMutable
{
	public static void main(String args[])
	{
		String s1=new String("Hello"); //immutable string can not modify

		s1.concat(" Krishna");

		System.out.println(s1);//hello
		
		StringBuilder sb=new StringBuilder("Hello");//mutable string can modify

		sb.append(" Krishna");

		System.out.println(sb);//hello krishna
	}
}