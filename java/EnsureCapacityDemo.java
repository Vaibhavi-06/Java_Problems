import java.util.*;

class EnsureCapacityDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.ensureCapacity(10);

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}
