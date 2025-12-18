import java.util.*;

class LastIndexDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println(list);

        System.out.println(list.lastIndexOf(20));
    }
}


/*import java.util.*;

class LastIndexDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(5);
        list.add(10);
        list.add(5);
        list.add(20);

        System.out.println(list);
        System.out.println(list.lastIndexOf(5));
    }
}*/
