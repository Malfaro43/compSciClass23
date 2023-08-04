import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rng = new Random();
        while (true) {
            int x = rng.nextInt(10);
            System.out.println(x);
        }
    }
}