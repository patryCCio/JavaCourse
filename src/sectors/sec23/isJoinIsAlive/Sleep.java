package sectors.sec23.isJoinIsAlive;

public class Sleep implements Runnable{
    @Override
    public void run() {
        for(int x=0; x<3; x++){
            System.out.println("Watek: " + (x+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
