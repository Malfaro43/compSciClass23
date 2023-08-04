import java.util.Scanner;


public class Prime
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        boolean isPrime = true;
        for (int i=2; (i<=n/2); i++) {
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
        if (n == 0){
            System.out.println(n + " is neither prime nor composite.");
        }
        else if (isPrime) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is composite.");
        }
    }
}