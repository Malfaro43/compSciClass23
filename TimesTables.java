import java.util.Scanner;


public class TimesTables
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer:");
        
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(Integer.toString(i*j)+"  ");
            }
        System.out.println();
        }

    }
}