package sectors.sec18.zad1;

public class Programista extends Osoba{
    private String company;
    private String stanowisko;

    public Programista(String imie, String nazwisko, String company, String stanowisko) {
        super(imie, nazwisko);
        this.company = company;
        this.stanowisko = stanowisko;
    }


    @Override
    void przedstawSie() {
        System.out.println("Jestem " + this.imie + " " + this.nazwisko + " i pracuję w firmie " +
                this.company + " na stanowisku " + this.stanowisko);
    }
}
