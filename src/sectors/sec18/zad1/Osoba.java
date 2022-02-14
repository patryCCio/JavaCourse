package sectors.sec18.zad1;

public class Osoba {
    String imie;
    String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    void przedstawSie() {
        System.out.printf("Jestem " + imie + " " + nazwisko);
    }
}
