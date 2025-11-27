class CopyArray {
    public static void main(String args[]) {
        int arr1[] = {10, 20, 30, 40, 50};
        int arr2[] = new int[arr1.length]; // Create another array of same size

        // Copy elements
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Display copied data
        System.out.println("Elements of Original Array:");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n\nElements of Copied Array:");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
