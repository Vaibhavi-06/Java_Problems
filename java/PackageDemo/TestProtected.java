package package2;
import package1.ProtectedDemo;

class TestProtected extends ProtectedDemo{

	
	public static void main(String args[])
	{
		TestProtected d1 = new TestProtected();
		System.out.println(d1.id);
		
	}

}