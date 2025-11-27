import java.util.Arrays;


public class AscendingOrder {
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 9};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort in ascending order
        Arrays.sort(arr);

        System.out.println("Array in Ascending Order: " + Arrays.toString(arr));
    }
}