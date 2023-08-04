import java.util.Scanner;

public class partc {
    public static void main(String[] args) {}
    public static int add3(int x) {
        return x + 3;
    }
    public static int superSubtraction(int x, int y) {
        return x + x -y;
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