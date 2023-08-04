import java.util.Scanner;

public class parta {
    public static void main(String[] args) {

    }
    public static void printGreeting() {
        System.out.println("Hello!");
    }
    public static void singSong() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Dashing through the snow\r\n" + //
                    "In a one-horse open sleigh\r\n" + //
                    "O'er the fields we go\r\n" + //
                    "Laughing all the way\r\n" + //
                    "Bells on bobtails ring\r\n" + //
                    "Making spirits bright\r\n" + //
                    "What fun it is to ride and sing\r\n" + //
                    "A sleighing song tonight, oh!\r\n" + //
                    "\r\n" + //
                    "Jingle bells, jingle bells\r\n" + //
                    "Jingle all the way\r\n" + //
                    "Oh, what fun it is to ride\r\n" + //
                    "In a one-horse open sleigh, hey!\r\n" + //
                    "Jingle bells, jingle bells\r\n" + //
                    "Jingle all the way\r\n" + //
                    "Oh what fun it is to ride\r\n" + //
                    "In a one-horse open sleigh\r\n" + //
                    "\r\n" + //
                    "Now the ground is white\r\n" + //
                    "Go it while you're young\r\n" + //
                    "Take the girls tonight\r\n" + //
                    "Sing this sleighing song\r\n" + //
                    "Get a bobtailed bay\r\n" + //
                    "Two forty for his speed\r\n" + //
                    "And hitch him to an open sleigh\r\n" + //
                    "And you will take the lead\r\n" + //
                    "\r\n" + //
                    "Oh, jingle bells, jingle bells\r\n" + //
                    "Jingle all the way\r\n" + //
                    "Oh, what fun it is to ride\r\n" + //
                    "In a one-horse open sleigh, hey!\r\n" + //
                    "Jingle bells, jingle bells\r\n" + //
                    "Jingle all the way\r\n" + //
                    "Oh, what fun it is to ride\r\n" + //
                    "In a one-horse open sleigh\r\n" + //
                    "Oh, what fun it is to ride\r\n" + //
                    "In one horse open sleigh!");
                }
    }
    public static void spamWithGreetings() {
        for (int i = 0; i < 10; i++) {
            printGreeting();
        }
    }
    public static void getAndCommentOnFavoriteColor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite color?");
        String favoriteColor = scan.nextLine();
        if (favoriteColor.equals("red")) {
            System.out.println("You like red, that's very cool!");
        }
        else if (favoriteColor.equals("blue")) {
            System.out.println("You like blue, that's one of my favorite colors!");
            }
        else if (favoriteColor.equals("green")) {
            System.out.println("You like green, like a tree");
            }
        else {
            System.out.println("You like " + favoriteColor);
        }
    }
}