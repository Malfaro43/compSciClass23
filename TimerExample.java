public class TimerExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int x = 1;
        for (int i = 1; i < 5270; i++) {
            x = x * i;
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(elapsedTime);
    }
}