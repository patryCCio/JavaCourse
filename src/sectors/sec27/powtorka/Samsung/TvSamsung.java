package sectors.sec27.powtorka.Samsung;

import sectors.sec27.powtorka.Tv;

public abstract class TvSamsung implements Tv {
    private boolean isTurnOn = false;
    private int canalNumber = 1;
    private int cale;

    public TvSamsung(int cale) {
        this.cale = cale;
    }

    @Override
    public void turnOn() {
        isTurnOn = true;
        System.out.println("SAMSUNG TV");
        showImage();
    }

    private void showImage(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(isTurnOn){
                    try {
                        System.out.println("Wyświetlaj obraz: " + canalNumber);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    public void turnOff() {
        System.out.println("Animacja przejścia!");
        //animacja przy zamykaniu
        isTurnOn = false;
    }

    @Override
    public void switchCanal(int number) {
        if(isTurnOn){
            canalNumber = number;
        }
    }
}
