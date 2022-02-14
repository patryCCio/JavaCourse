package sectors.sec11.zad3;

//3. Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b (a < b). Wypisz na ekran zakres liczb od a do b.

public class Ex3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 8;

        if(a<b){
            System.out.print("Liczby: ");
            for(int x=a; x<b; x++){
                System.out.print(x + " ");
            }
        }else{
            System.out.println("zmienna a musi być większa od zmiennej b!");
        }

    }
}
