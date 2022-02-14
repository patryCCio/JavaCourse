package sectors.sec7.zad1;
/*1. Uzupełnij tablicę typu int rozmiaru 5
dowolnymi wartościami. Następnie zsumuj wszystkie
elementy tej tablicy i wynik wypisz na ekran.
Sumowania dokonaj poprzez dodawanie elementów odwołując się do indeksów tablicy.
 */


public class Ex1 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};

        int resultTab = tab[0] + tab[1]+ tab[2] + tab[3] + tab[4];
        System.out.println("Sumka: " + resultTab);
    }
}
