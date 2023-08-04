import java.util.Scanner;


public class Binary
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer:");
        
        int n = in.nextInt();
        int temp = n;
        if (temp<0) {temp = temp%256 + 256;}
        if (temp > 255) {temp = temp%256;}
        String a = "0b";
        for (int i = 128; i>0; i = i/2) {
            if (i < temp) {
                a = a + "1";
                temp = temp - i;
            } 
            else {
                a = a + "0";
            }
        }
        System.out.println("The number " + Integer.toString(temp) + " is equal to " + a + " in binary.");
    }

}