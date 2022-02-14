package sectors.sec24.zad3;

public class PlayerTwo implements Runnable{
    @Override
    public void run() {
        for(int x=0; x<1000; x++){
            System.out.println("Będę pierwszy - to ja PlayerTwo!");
        }
        System.out.println("Zakończyłem! Melduje się PlayerTwo!");
    }
}
