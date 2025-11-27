class PolyDemo{
	
void display()
{
	System.out.println("Method without arg Parent");
}

}
class Test1 extends PolyDemo{

void display()
{
	System.out.println("Method without arg Parent");
}

public static void main(String args[])
{
	Test1 d1=new Test1();
	d1.display();
}
}
