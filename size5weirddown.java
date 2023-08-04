public class size5weirddown {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 5; i > 0; i--) {
            for (int j = 4; j<a; j++) {System.out.print(" ");}
            a++;
            for (int j = 0; j<i; j++) {System.out.print("*");}
            System.out.println();
            
        }
    }
}