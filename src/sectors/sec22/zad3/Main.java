package sectors.sec22.zad3;
/*
Zadanie 3
Stwórz interfejs wewnętrzny o nazwie "Info" z metodą
“wyswietlInfo” w klasie, w której masz metodę main.
Przećwiczyć tworzenie klasy anonimowej tworząc ją w
metodzie main i przesłoń metodę tak, aby wypisywała tekst
“informacja wypisana z klasy anonimowej”.
Następnie wywołaj tę metodę “wyswietlInfo” i sprawdź czy
prawidłowo została stworzona klasa anonimowa.
 */
public class Main {
    public static void main(String[] args) {
        Info info1 = new Info() {
            @Override
            public void wyswietlInfo() {
                System.out.println("Wyswietlono z klasy anonimowej!");
            }
        };

        info1.wyswietlInfo();
    }
    public interface Info {
        void wyswietlInfo();
    }
}
