public class shape4 {
    public static void main(String[] args) {
        int spaces = 5;
        for (int i = 0; i < 4; i++) {
            spaces--;
            System.out.print(" ".repeat(spaces));
            System.out.print("* ".repeat(i));
            System.out.println();
        }
        spaces = spaces -2;
        for (int i = 4; i >0; i--) {
            spaces++;
            System.out.print(" ".repeat(spaces));
            System.out.print("* ".repeat(i));
            System.out.println();
        }
    }
}