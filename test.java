public class test {
    public static void main(String[] args) {
        MyArrayList cool = new MyArrayList();
        cool.add("a");
        cool.add("b");
        cool.add("c");
        cool.add("d");
        cool.add("e");
        cool.add("f");
        cool.insert(1, "g");
        for (int i = 0; i<cool.length; i++) {
            System.out.println(cool.get(i));
        }
    }
}