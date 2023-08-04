import java.util.Scanner;

public class partb {
    public static void main(String[] args) {}
    public static void printTwice(int x) {
        System.out.println(x);
        System.out.println(x);
    }
    public static void printNGreetings(int n) {
        for (int i = 0; i < n; i++) {
            parta.printGreeting();
        }
    }
    public static void bottles(int n, String beverage) {
        System.out.println(Integer.toString(n) + " bottles of " + beverage + " on the wall, " + Integer.toString(n) + " bottles of " + beverage + ".\nKnock one down, pass it around, " + Integer.toString(n) + " bottles of " + beverage + " on the wall.");
    }
    public static boolean saidYes(String answer) {
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("yeah") || answer.equalsIgnoreCase("affirmative")) {
            return true;
        }
        else {return false;}
    }
    public static String substituteTN(String oldString) {
        return oldString.replace("t", "n");
    }
}