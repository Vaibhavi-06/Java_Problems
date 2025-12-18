import java.util.*;

class CloneDemo {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList list2 = (ArrayList) list1.clone();

        System.out.println("Original List: " + list1);
        System.out.println("Cloned List: " + list2);
    }
}
