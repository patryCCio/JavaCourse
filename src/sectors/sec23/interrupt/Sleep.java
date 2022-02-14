package sectors.sec23.interrupt;

public class Sleep implements Runnable{
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("Sleep!");
                Thread.sleep(1000);

            }
        }catch (InterruptedException e) {
            System.out.println("Poszedł exception w sleep");
        }

    }
}
