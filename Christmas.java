public class Christmas {
    public static void main(String[] args) {
        String output = " day of Christmas, my trule love gave to me:\n";
        String gift = "";
        for (int i = 1; i <= 12; i++) {
            if (i==1) {
                gift = "A partridge in a pear tree.";
            }
            else if (i==2) {
                gift = "Two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==3) {
                gift = "Three french hens, two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==4) {
                gift = "Four calling birds, two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==5) {
                gift = "Five gold rings, two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==6) {
                gift = "Six geese a-laying, two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==7) {
                gift = "Seven swans a-swimming, two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==8) {
                gift = "Eight maids a-milking, two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==9) {
                gift = "Nine ladies dancing, two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==10) {
                gift = "Ten lords a-leaping, two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==11) {
                gift = "Eleven pipers piping, two turtle doves, and a partridge in a pear tree.";
            }
            else if (i==12) {
                gift = "Twelve drummers drumming, two turtle doves, and a partridge in a pear tree.";
            }
        System.out.println("On the " + Integer.toString(i) + output + gift);
        System.out.println();
        }
    }
}