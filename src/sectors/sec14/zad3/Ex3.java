package sectors.sec14.zad3;

public class Ex3 {
    public static void main(String[] args) {
        String word = "Potrafię coraz więcej z programowania";
        for(int x=word.length()-1; x>=0; x--){
            System.out.print(word.charAt(x));
        }
    }
}
