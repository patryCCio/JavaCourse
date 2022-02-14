package sectors.sec28.firstVideoEnum;

public class Main {
    public static void main(String[] args) {
        TheDirectionsOfTheWorld direct = TheDirectionsOfTheWorld.NORTH;
        System.out.println(direct);

        if(direct == TheDirectionsOfTheWorld.NORTH){
            System.out.println("Poszedł na północ");
        }else if(direct == TheDirectionsOfTheWorld.SOUTH){
            System.out.println("Poszedł na południe");
        }else if(direct == TheDirectionsOfTheWorld.WEST){
            System.out.println("Poszedł na zachód");
        }else{
            System.out.println("Poszedł na wschód");
        }
    }
}
