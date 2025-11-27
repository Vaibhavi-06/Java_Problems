class products
{
	int pid;
	String pname;
	float pprice;

	products(int pid, String pname, float pprice)
	{
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;	
	}

	public void display()
	{
		System.out.println("Product Id: "+pid+" Product Name: "+pname+" Product Price: "+pprice);
	}
}


class ProductData{

	public static void main(String args[])
	{
		products obj[]=new products[5];	//datetype obj[]=new datatype[size];
		
		obj[0]=new products(101,"iPhone",150);
		
		obj[1]=new products(102,"iWatch",200);

		obj[2]=new products(103,"SmartWatch",90);

		obj[3]=new products(104,"Tablet",900);

		obj[4]=new products(105,"laptop",800);

		obj[0].display();

		obj[2].display();
	}

}