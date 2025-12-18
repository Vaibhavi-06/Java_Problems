import java.util.*;
class ArrayListPractice {
    public static void main(String args[]) {

        ArrayList<String> l1 = new ArrayList<String>();

        l1.add("Vaibhavi");
        l1.add("Dhanashri");
        l1.add("Vaishnavi");
        l1.add("Akshada");
        l1.add("Shital");

        System.out.println("Original list: " + l1);

	System.out.println("Element at index 2: " + l1.get(2));
        System.out.println("First Element: " + l1.get(0));
        System.out.println("Last Element: " + l1.get(l1.size() - 1));

        l1.ensureCapacity(10);

        Collections.sort(l1);
        System.out.println("Sorted List: " + l1);
        System.out.println("Element at index 1: " + l1.get(1));

        System.out.println("Remove Element: " + l1.remove(0));
        System.out.println("Remove Element at index 2: " + l1.remove(2));

        System.out.println("Contains 'Shital': " + l1.contains("Shital"));
        System.out.println("Index Of 'Akshada': " + l1.indexOf("Akshada"));
        System.out.println("Last Index Of 'Vaibhavi': " + l1.lastIndexOf("Vaibhavi"));
        System.out.println("Size of List: " + l1.size());
        System.out.println("Is List Empty?: " + l1.isEmpty());

        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(10);
        l2.add(56);
        l2.add(72);
        l2.add(77);
        System.out.println("L2: " + l2);

        ArrayList<String> temp = new ArrayList<>();
        for (Integer i : l2) {
            temp.add(String.valueOf(i));
        }
        l1.addAll(temp);
        System.out.println("After addAll: " + l1);
        l1.removeAll(temp);
        System.out.println("After removeAll l2 elements: " + l1);

        l2.clear();
        System.out.println("L2 after clear: " + l2);

         List<String> sub = l1.subList(1, l1.size());
         System.out.println("Sub List: " + sub);

        Object[] arr1 = l1.toArray();
        System.out.println("ArrayList to Object Array:");
        for (Object o : arr1) {
            System.out.println(o);
        }

        ArrayList<String> l3 = (ArrayList<String>) l1.clone();
        System.out.println("Original List: " + l1);
        System.out.println("Cloned List: " + l3);
    }
}
