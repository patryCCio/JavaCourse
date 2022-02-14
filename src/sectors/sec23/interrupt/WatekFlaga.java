package sectors.sec23.interrupt;

public class WatekFlaga implements Runnable{
    private boolean isWork;

    @Override
    public void run() {
        isWork = true;
        while(isWork){
            System.out.println("isWork działa");
        }
        System.out.println("isWork zakończył działanie");
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}
