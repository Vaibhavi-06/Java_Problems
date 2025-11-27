class AverageArray {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;
        double average;

        // Calculate sum of array elements
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Calculate average
        average = (double) sum / arr.length;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
