package sectors.sec14.zad2;

/*2. Dla zdania "Potrafię coraz więcej z programowania."
wypisz każdy znak w osobnej linii
 */

public class Ex2 {
    public static void main(String[] args) {
        String word = "Potrafię coraz więcej z programowania";
        for(int x=0; x<word.length(); x++){
            System.out.println(word.charAt(x));
        }
    }
}
