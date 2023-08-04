public class CaesarCipher {
    public static void main(String[] args) {
        String encrypted = encryptCaesar("five ducks", 5);
        System.out.println(decryptCaesar(encrypted, 5));
    }
    public static String encryptCaesar(String plaintext, int shift) {
        String ret = "";

        for (int i=0; i<plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if ((c > 'z' - shift && c<= 'z') || (c > 'Z' - shift && c <= 'Z')) {
                c = (char)(c-26);
            }
            c = (char)(c+shift);
            ret = ret + c;
        }
        return ret;
    }
    public static String decryptCaesar(String encrypted, int shift) {
        return encryptCaesar(encrypted, 26+shift);
    }
}