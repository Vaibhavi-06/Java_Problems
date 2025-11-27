class SumNaturalNumbers {
    public static void main(String args[]) {
        int arr[] = new int[10];  // Array to store 10 numbers
        int sum = 0;

        // Check if user entered 10 numbers in command line
        if(args.length < 10) {
            System.out.println("Please enter 10 numbers as command line arguments.");
            return;
        }

        // Store and sum numbers
        for(int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(args[i]); // Convert string to integer
            sum = sum + arr[i];
        }

        // Display numbers and sum
        System.out.println("Entered Numbers:");
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum of First 10 Natural Numbers: " + sum);
    }
}
