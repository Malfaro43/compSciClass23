import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Hi");
        myList.add("test");
        
        for (int i=0; i<myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}