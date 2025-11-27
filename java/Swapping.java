 class Swapping {
    public static void main(String[] args) {
        int a = 10, b = 20;


	System.out.println("Before swapping: a = " + a + ", b = " + b);


        int temp = a;  // store a in temp
        a = b;         // assign b to a
        b = temp;      // assign temp (old a) to b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
