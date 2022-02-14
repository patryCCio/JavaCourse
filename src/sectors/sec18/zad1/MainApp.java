package sectors.sec18.zad1;

public class MainApp {
    public static void main(String[] args) {
        Programista programista = new Programista("Patryk", "Szczerbiński", "XYZ", "Junior Java Developer");
        programista.przedstawSie();
        Osoba osoba = new Osoba("Jan", "Kowalski");
        Programista programista1 = new Programista(osoba.imie, osoba.nazwisko, "XYZ", "Junior Front End Developer");
        programista1.przedstawSie();
    }
}
