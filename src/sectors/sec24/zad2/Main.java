package sectors.sec24.zad2;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Czasoodmierzacz());
        thread.start();
    }
}
