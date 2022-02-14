package sectors.sec23.interrupt;

public class WatekInterrupted implements Runnable{
    @Override
    public void run(){
        while(!Thread.interrupted()){
            System.out.println("Interrupted Runnable działa!");
        }
        System.out.println("Elo elo elo!");
    }
}
