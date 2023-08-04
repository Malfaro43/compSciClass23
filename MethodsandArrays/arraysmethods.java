import java.util.Scanner;

public class arraysmethods {
    public static void main(String[] args) {}
    public static void printIntArray(int[] theArray) {
        for (int i : theArray) {
            System.out.println(i);
        }
    }
    public static int sumArray(int[] theArray) {
        int sum = 0;
        for (int i : theArray) {
            sum += i;
        }
        return sum;
    }
    public static int averageArray(int[] theArray) {
        return sumArray(theArray) / theArray.length;
    }
    public static int maxArray(int[] theArray) {
        int max = theArray[0];
        for (int i : theArray) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static int minArray(int[] theArray) {
        int min = theArray[0];
        for (int i : theArray) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}