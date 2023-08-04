import java.util.Scanner;

public class AdvancedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you like choclate chip cookies?");
        String response = scan.nextLine();


        // || means OR, && means AND
        if (response.equals("Yes") || response.equals("y") || response.equals("YES")) {
            System.out.println("Cool");
        }
        else {
            System.out.println("Alright");
        }
    }
}