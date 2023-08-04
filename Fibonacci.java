public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int fibLoop(int n) {
        int prev1 = 1;
        int prev2 = 1;

        int answer = 1;

        
        for (int i=1; i<=n; i++) {
            prev2 = prev1;
            prev1 = answer;
            answer = prev1 + prev2;
        }
        return answer;
    }
}
//1 1 2 3 5 8 13