import java.util.*;

class SizeDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        System.out.println(list.size());   // before adding elements

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.size());   // after adding elements
    }
}
