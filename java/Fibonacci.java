class Fibonacci{
    public static void main(String args[]) {
        int n = 10;   // number of terms
        int a = 0;
        int b = 1;
        int c;

        System.out.println(a); // print first number
        System.out.println(b); // print second number

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
