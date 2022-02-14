package sectors.sec11.zad1;

//1. Wypisz na ekran liczby od 0 do 30, a następnie od 30 do 0.

public class Ex1 {
    public static void main(String[] args) {
        for(int x=0 ;x<30; x++){
            System.out.print(x + " ");
        }
        System.out.println();
        for(int x=30; x>0; x--){
            System.out.print(x + " ");
        }
    }
}
