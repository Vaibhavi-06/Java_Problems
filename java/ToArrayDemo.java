import java.util.*;

class ToArrayDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("A");
        list.add("B");
        list.add("C");

        Object[] arr = list.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
