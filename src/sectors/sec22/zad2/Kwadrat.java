package sectors.sec22.zad2;

public class Kwadrat implements Figury {
    private double a, b;

    public Kwadrat(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double obwod() {
        return (2*a)+(2*b);
    }

    @Override
    public double pole() {
        return a*b;
    }
}
