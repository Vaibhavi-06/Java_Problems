class ElectricityBill {
	public static void main(String args[])
	{
        int unit = 400;  

        if (unit <= 100) 
	{
            System.out.println("low usage");
        }
	else if (unit >= 101 && unit <= 300) 
	{
            System.out.println("medium usage");
        } 
	else if (unit > 300) 
	{
            System.out.println("high usage");
        } 
	else {
            System.out.println("invalid unit");
        }
    }
}
