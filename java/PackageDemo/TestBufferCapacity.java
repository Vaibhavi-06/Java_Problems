class TestBufferCapacity
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer(); //default capacity

		System.out.println(sb.capacity()); 

//[(previouscapacity+1)*2]-increase the capacity using this formula

		sb.append("Welcome everyone to fortune");

		System.out.println(sb.capacity());//16

		
		StringBuffer sb1=new StringBuffer(10);

		sb1.append("hello to fac dear all");

		System.out.println(sb1.capacity());
	}
}                                                                                                                                            