package sectors.sec23.runnable;

import sectors.sec23.thread.FirstClass;
import sectors.sec23.thread.SecondClass;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new FirstClass());
        Thread thread2 = new Thread(new SecondClass());

        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(() -> {
            for(int x=0; x<100; x++){
                System.out.println("Third class: " + x);
            }
        });

                thread3.start();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Elo");
                    }
                }).start();
    }
}
