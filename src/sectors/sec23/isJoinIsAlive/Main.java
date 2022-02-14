package sectors.sec23.isJoinIsAlive;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Sleep());
        thread.start();

        System.out.println("Czy żyje: " + thread.isAlive());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Czy zyje: " + thread.isAlive());

        System.out.println("Stop");
    }
}
