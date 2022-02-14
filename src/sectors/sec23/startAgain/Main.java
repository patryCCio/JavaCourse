package sectors.sec23.startAgain;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        startExampleRunnable();
        Thread.sleep(1000);
        System.out.println();
        startExampleRunnable();

    }

    private static void startExampleRunnable() {
        Thread thread = new Thread(new ExampleRunnable());
        thread.start();
    }
}
