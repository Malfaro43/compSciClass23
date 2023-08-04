public class ArrayQuirks {
    public static void main(String[] args) {
        int[] x = new int[]{1,2,3};
        int[] y = new int[]{1,2,3};
        System.out.println(x == y); //Doesn't actually compare the content, tells you if they are the SAME OBJECT
        // To check element equality, have to use a for loop    
    }
}