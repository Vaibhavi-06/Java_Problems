import java.util.*;


class SubListDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);

        List sub = list.subList(1, 4);

        System.out.println("Sub List: " + sub);
    }
}
