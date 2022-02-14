package sectors.sec24.zad1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ta informacja została wypisana z klasy anonimowej i z mojego wątku");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }

}
