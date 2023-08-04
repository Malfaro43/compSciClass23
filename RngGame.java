import java.util.Random;
import java.util.Scanner;

public class RngGame {
    public static void main(String[] args) {
        Random rng = new Random();
        int secret_number = rng.nextInt(10);
        System.out.println(secret_number);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Guess a random number between 0 and 9");
            int response = scan.nextInt();
            if (response==secret_number) {
                System.out.println("You guessed the number!");
                break;
            }
        }
    }
}