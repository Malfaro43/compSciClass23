import java.util.Scanner;


public class prob3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input an Integer:");
        
        int num = in.nextInt();
        for (int i =1; i<=12; i++) {
            System.out.println(i * num);
        }
    }        
}
