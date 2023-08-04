import java.util.Scanner;


public class Factorials
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer:");
        
        int age = in.nextInt()-1;
        int outcome = age+1;
        while (age>0) {
            outcome = outcome*age;
            age--;
        }
        System.out.println(outcome);
    }

}