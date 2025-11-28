/*PROBLEM 2: ARRAY OPERATIONS MENU 
(Loops + Arrays + Exception Handling)*/


import java.util.Scanner;

class InvalidSizeException extends Exception {
    InvalidSizeException(String msg) {
        super(msg);
    }
}

class ArrayMenu
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            if (size <= 0) {
                throw new InvalidSizeException("Array size greater than 0");
            }

            int arr[] = new int[size];
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int choice;
            do {
                System.out.println("Menu:");
                System.out.println("1. Display");
                System.out.println("2. Max");
                System.out.println("3. Sum");
                System.out.println("4. Search");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Array elements: ");
                        for (int num : arr) System.out.print(num + " ");
                        System.out.println();
                        break;

                    case 2:
                        int max = arr[0];
                        for (int num : arr) if (num > max) max = num;
                        System.out.println("Largest element: " + max);
                        break;

                    case 3:
                        int sum = 0;
                        for (int num : arr) sum += num;
                        System.out.println("Sum of elements: " + sum);
                        break;

                    case 4:
                        System.out.print("Enter element to search: ");
                        int target = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < size; i++) {
                            if (arr[i] == target) {
                                System.out.println("Element found at position: " + (i + 1));
                                found = true;
                                break;
                            }
                        }
                        if (!found) System.out.println("Element not found");
                        break;

                    case 5:
                        System.out.println("Exit...");
                        break;

                    default:
                        System.out.println("Invalid choice...");
                }

            } while (choice != 5);

        } catch (InvalidSizeException e) {
            System.out.println(e);
        }

        sc.close();
    }
}
