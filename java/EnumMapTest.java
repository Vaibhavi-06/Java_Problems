import java.util.*;

enum colors{Green,Saffron,Blue,Red,Yellow}

public class EnumMapTest
{
	public static void main(String args[])
	{
		EnumMap<colors,String> map=new EnumMap<colors,String>(colors.class);

		map.put(colors.Green,"1");
		map.put(colors.Saffron,"2");
		map.put(colors.Blue,"3");

		System.out.println(map);

	}
}