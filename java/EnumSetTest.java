import java.util.*;

enum colors{Green,Saffron,Blue,Red,Yellow}

enum days{Monday,Tuesday,wednesday,Thursday,Friday,Saturday,Sunday}

enum city{Pune,Mumbai,Nagpur,Delhi,Bangleru}

public class EnumSetTest
{
	public static void main(String args[])
	{
		List<city> l1=List.of(city.Pune,city.Mumbai);
				
		Set<colors> s1=EnumSet.allOf(colors.class);

		System.out.println("Name of Colors: "+s1);

		Set<days> s2=EnumSet.of(days.Monday,days.Friday,days.Sunday);

		System.out.println("Name of Days: "+s2);

		Set<colors> s3=EnumSet.noneOf(colors.class);
	
		System.out.println("Name of Colors: "+s3);

		Set<city> s4=EnumSet.copyOf(l1);

		System.out.println("Elements of s4: "+s4);
	}
}