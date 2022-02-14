package sectors.sec24.zad3;

public class Main {
    public static void main(String[] args) {
        Thread p1 = new Thread(new PlayerOne());
        Thread p2 = new Thread(new PlayerTwo());

        p1.start();
        p2.start();
    }
}
