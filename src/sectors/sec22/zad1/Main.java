package sectors.sec22.zad1;

/*
Zadanie 1
- stwórz klasę abstrakcyjną o nazwie “StacjaKosmiczna”
- dodaj metodę abstrakcyjną o nazwie “atakujLaserem”
- stwórz nową klasę o nazwie “GwiazdaSmierci”, która będzie dziedziczyć po klasie “StacjaKosmiczna”. Zaimplementuj metodę “atakujLaserem”, która wyświetli na ekranie “piu piu"
- przetestuj w main
 */

public class Main {
    public static void main(String[] args) {
        GwiazdaSmierci gwiazdaSmierci = new GwiazdaSmierci();
        gwiazdaSmierci.atakujLaserem();
    }
}
