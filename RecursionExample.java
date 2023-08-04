public class RecursionExample {
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
    public static void myMethod() {
        printNTimes(10);
    }
    public static void printNTimes(int n) {
        if (n > 0 ) {
            System.out.println("Hello");
            printNTimes(n-1);
        }
    }
    public static int factorial(int n) {
        if (n <= 1)
        {
            return 1;
        }
        return factorial(n-1) * n;
    }
}