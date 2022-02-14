package sectors.sec22.zad2;

/*
Zadanie 2
- stwórz interfejs o nazwie "Figury", który będzie posiadał metody “obwod”, “pole”. Obydwie metody będą zwracały liczbę zmiennoprzecinkową
- stwórz dwie klasy “Kolo”, “Prostokat”, które będą implementowały ten interfejs
- dodaj konstruktor, w którym w klasie “Kolo” będzie przekazywany promień koła, a w klasie “Prostokat” długości dwóch boków prostokąta a i b
- zaimplementuj metody w obydwóch klasach, aby dokonywały poprawnych obliczeń
- pola będą prywatne a konstruktor i metody publiczne
- przetestuj w main
 */

public class Main {
    public static void main(String[] args) {
        Kolo kolo = new Kolo(3);
        Kwadrat kwadrat = new Kwadrat(2,4);
        System.out.println("Pole kola: " + kolo.pole());
        System.out.println("Obwod kola: " + kolo.obwod());

        System.out.println("-----");

        System.out.println("Pole kwadratu: " + kwadrat.pole());
        System.out.println("Obwod kwadratu: " + kwadrat.obwod());
    }
}
