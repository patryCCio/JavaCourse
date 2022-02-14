package sectors.sec16.zad1;

public class Programista {
    private String name;
    private String surname;
    private String language;
    private double salary;

    Programista(String name, String surname, String language, double salary){
        this.name = name;
        this.surname = surname;
        this.language = language;
        this.salary = salary;
    }

    public String pobierzImie(){
        return this.name;
    }

    public String pobierzNazwisko(){
        return this.surname;
    }

    public String pobierzJezyk(){
        return this.language;
    }

    public double podajZarobki(){
        return this.salary;
    }
}
