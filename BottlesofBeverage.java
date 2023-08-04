import java.util.Scanner;

public class BottlesofBeverage
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the beverage:");
        String beverage = in.nextLine();
        System.out.println("Enter the number of bottles:");
        int bottles = in.nextInt();
        for (int i = bottles; i > 0; i--)
        {
            if (i==1) {
                System.out.println(Integer.toString(i) + " bottle of " + beverage + " on the wall, " + Integer.toString(i) + " bottle of " +  beverage + "!\nKnock it down, pass it around, no more bottles of " + beverage + " on the wall.");
            }
            else {
                System.out.println(Integer.toString(i) + " bottles of " + beverage + " on the wall, " + Integer.toString(i) + " bottles of " +  beverage + "!\nKnock one down, pass it around, " + Integer.toString(i-1) + " bottles of " + beverage + " on the wall.");
                System.out.println();
            }
        }
    }
}