package sectors.sec14.zad1;

/*1. Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię, do drugiej nazwisko oraz do trzeciej imię i nazwisko oddzielone spacją. Następnie wykonaj polecenia używając odpowiednich metod z String (nie robić nic ręcznie! :) ) i wypisując informacje na ekran:

a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko

b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"

c) wypisz nazwisko z WIELKICH LITER

d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło
 */

public class Ex1 {
    public static void main(String[] args) {
        String name = "Patryk";
        String surname = "Szczerbiński";
        String fullName = "Patryk Szczerbiński";
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("--------------------");

        //a
        System.out.println("a)");
        System.out.println("Imię: " + name.length());
        System.out.println("Nazwisko: " + surname.length());
        System.out.println("Imię i nazwisko: " + fullName.length());

        //b
        System.out.println("b)");
        System.out.print((name=="Alicja"));
        System.out.println();
        System.out.println("name.equals(Alicja) : " + name.equals("Alicja"));

        //c
        System.out.println("c)");
        System.out.println("Nazwisko z wielkich: " + surname.toUpperCase());

        //d
        System.out.println("d)");
        System.out.println("Pełne imię: " + fullName.replaceAll("a", "e"));
    }
}
