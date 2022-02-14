package sectors.sec23.runnable;

public class FirstClass implements Runnable{
    @Override
    public void run() {
        for(int x=0; x<100; x++){
            System.out.println("First class: " + x);
        }
    }
}
