package sectors.sec24.zad2;

public class Czasoodmierzacz implements Runnable{
    @Override
    public void run() {
        int x = 0;
        while(true){
            System.out.println(x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x++;
        }
    }
}
