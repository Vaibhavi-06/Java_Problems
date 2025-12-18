import java.util.*;

class VectorPractice {
	public static void main(String args[]) 
{
         	Vector<String> v = new Vector<>();

        
        	v.add("Tiago");
       		v.add("Tigor");
        	v.add("Altroz");
        	v.add("Harrier");
        	v.add("Punch");

        	v.addElement("Safari");

        	System.out.println("Original Vector: " + v);
        	System.out.println("First Element: " + v.firstElement());
        	System.out.println("Last Element: " + v.lastElement());

        	System.out.println("Element at index 3: " + v.elementAt(3));

       		System.out.println("Element at index 2 using get(): " + v.get(2));
        	v.set(2, "Altroz New");
        	System.out.println("After set at index 2: " + v);
		System.out.println(v.elements());
		System.out.println(v.elementAt(4));
        
        	v.remove("Punch");
        	System.out.println("After removing 'Punch': " + v);
        	v.removeElementAt(3);
        	System.out.println("After removing element at index 3: " + v);

                System.out.println("Index of 'Tiago': " + v.indexOf("Tiago"));
        	System.out.println("Is Vector empty? " + v.isEmpty());

        	System.out.println("Size of Vector: " + v.size());
        	System.out.println("Capacity of Vector: " + v.capacity());

        	Vector<String> vClone = (Vector<String>) v.clone();
        	System.out.println("Cloned Vector: " + vClone);

      		List<String> sub = v.subList(1, v.size());
        	System.out.println("Sub List from index 1 to end: " + sub);

        	Object[] arr = v.toArray();
        	System.out.println("Vector to Array:");
        	for (Object o : arr) {
                System.out.println(o);
                }

        	v.removeAllElements();
        	System.out.println("Vector after removeAllElements(): " + v);
    }
}
