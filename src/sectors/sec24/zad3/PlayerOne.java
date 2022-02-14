package sectors.sec24.zad3;

public class PlayerOne implements Runnable{
    @Override
    public void run() {
        for(int x=0; x<1000; x++){
            System.out.println("Będę pierwszy - to ja PlayerOne!");
        }
        System.out.println("Zakończyłem! Melduje się PlayerOne!");
    }
}
