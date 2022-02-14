package sectors.sec23.thread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new FirstClass());
        Thread thread2 = new Thread(new SecondClass());

        thread1.start();
        thread2.start();
    }
}
