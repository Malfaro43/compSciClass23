import java.util.Scanner;


public class prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input an Integer:");
        
        int num = in.nextInt();
        if (num<0) {
            System.out.println("Invalid Input");
        }
        else {
            for (int i=3; i<=num; i=i+3){
                System.out.println(i);
        }
        }        
    }
}