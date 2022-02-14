package sectors.sec23.interrupt;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Sleep
        Thread thread = new Thread(new Sleep());
        thread.start();
        thread.interrupt();

        //WatekInterrupted
        Thread threadInterrupted = new Thread(new WatekInterrupted());
        threadInterrupted.start();
        Thread.sleep(1000);
        threadInterrupted.interrupt();

        //WatekFlaga
        WatekFlaga flaga = new WatekFlaga();
        Thread thread1 = new Thread(flaga);
        thread1.start();

        Thread.sleep(1000);
        flaga.setWork(false);

    }
}
