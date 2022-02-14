package sectors.sec23.thread;

public class FirstClass extends Thread{
    @Override
    public void run() {
        for(int x=0; x<100; x++){
            System.out.println("First class: " + x);
        }
    }
}
