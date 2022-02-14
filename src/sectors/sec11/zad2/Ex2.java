package sectors.sec11.zad2;

//2. Napisz program, które wypisze tylko liczby parzyste z zakresu od 0 do 30.

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Liczby parzyste od 0 do 30: ");
        for(int x=0 ;x<30; x++){
            if(x%2==0) System.out.print(x + " ");
        }
    }
}
