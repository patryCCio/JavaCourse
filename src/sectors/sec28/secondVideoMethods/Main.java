package sectors.sec28.secondVideoMethods;

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

        //ordinal(), valueOf(), values()
        direct = TheDirectionsOfTheWorld.WEST;
        System.out.println("enum na int = ordinal(): " + direct.ordinal());
        System.out.println("string na enum = valueOf(): " + direct.valueOf("WEST"));

        TheDirectionsOfTheWorld[] directions = TheDirectionsOfTheWorld.values();
        for(int x=0; x<directions.length; x++){
            System.out.println("i: " + x + ", kieruek: " + directions[x]);
        }

        System.out.println(TheDirectionsOfTheWorld.values()[0]);
    }
}

