package sectors.sec11.zad4;

//4. Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami. Wypisz wszystkie liczby z tej tablicy na ekran. Następnie wypisz wszystkie liczby od tyłu.

public class Ex4 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int x=0; x<10; x++){
            tab[x] = x+1;
        }

        System.out.print("Liczby odwrocone: ");

        for(int x=9; x>=0; x--){
            System.out.print(tab[x] + " ");
        }
    }
}
