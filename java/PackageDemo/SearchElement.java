class SearchElement {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int search = 30;   // element to search
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == search) {
                found = true;
                System.out.println(search + " found at position " + (i + 1));
                break;
            }
        }

        if(!found) {
            System.out.println(search + " not found in the array.");
        }
    }
}
