package sectors.sec16.zad1;

public class MainApp {
    public static void main(String[] args) {
    Programista programista1 = new Programista("Patryk", "Szczerbiński", "Java", 4_500);
        System.out.println(programista1.pobierzImie() + " " + programista1.pobierzNazwisko());
        System.out.println("Language: " + programista1.pobierzJezyk());
        System.out.println("Zarobki: " + programista1.podajZarobki());
    }
}
