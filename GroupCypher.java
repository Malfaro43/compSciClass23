import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GroupCypher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to encrypt?");
        String plain = scan.nextLine();
        System.out.println("Previous Message: ");
        String oldMessage = scan.nextLine();
        System.out.println(encrypt(plain, oldMessage));
        //System.out.println(decrypt(encrypt(plain, lastMessage)));
    }
    
    public static String encrypt(String plain, String oldMessage) {
        plain = plain.toLowerCase().replaceAll("\\s", "");
        char[] alph = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int shift = 0;
        StringBuilder encoded = new StringBuilder();
        int[] pad;
        if (oldMessage.equals("none")) {
            pad = genPad(100);
        }
        else {pad = getMessagePad(oldMessage, alph);}
        int it = 0;
        for (char i : plain.toCharArray()) {
            shift = new String(alph).indexOf(i) + pad[it];
            if (shift > 25) {shift = shift - 25;}
            encoded.append(alph[shift]);
            it++;
        }
        return "Encoded Message with Pad Inserted: " + placePad(encoded.toString().toCharArray(), alph);    
    }
    
    public static String decrypt(String encrypted, String lastMessage) {
        int[] messagePad = new int[100];
        return "";
    }
    
    public static int[] getMessagePad(String message, char[] alph) {
        char[] mArray = message.toCharArray();
        int length = Integer.parseInt(mArray[0]+"" + mArray[mArray.length-1]+"");
        int a = 0;
        int[] pad = new int[100];
        for (char i: Arrays.copyOfRange(mArray, 1, mArray.length-1)) {
            if (a%2!=0) {
                pad[a] = new String(alph).indexOf(i);
            }
            a++;
        }
        return pad;
    }
    
    public static int[] genPad(int length) {
        Random rand = new Random();
        int[] pad = new int[length];
        for (int i = 0; i<length; i++) {
            pad[i] = rand.nextInt(25);
        }
        return pad;
    }
    
    public static String placePad(char[] encoded, char[] alph) {
        int[] newPad = genPad(100);
        StringBuilder out = new StringBuilder();
        out.append(Integer.toString(encoded.length).charAt(0));
        for (int i=0; i<=encoded.length-1; i++) {
            out.append(alph[newPad[i]]);
            out.append(encoded[i]); //FIX
        }
        for (int i=encoded.length; i<newPad.length-1; i++) {
            out.append(alph[newPad[i]]);
        }
        out.append(Integer.toString(encoded.length).charAt(1));
        return out.toString();
    }
}