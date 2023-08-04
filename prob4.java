public class prob4 {
    public static void main(String[] args) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxy".toCharArray();
        int temp = 0;
        for (char i : alphabet) {
            if (temp==5) {
                System.out.println();
                System.out.print(i+"  ");
                temp = 0;
            }
            else {System.out.print(i+"  ");}
            temp ++;
        }
    }
}