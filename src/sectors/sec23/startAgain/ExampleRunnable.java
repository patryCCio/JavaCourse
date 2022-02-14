package sectors.sec23.startAgain;

public class ExampleRunnable implements Runnable{
    @Override
    public void run() {
        for(int x=0; x<10; x++){
            System.out.println("X = " + x);
        }
    }
}
