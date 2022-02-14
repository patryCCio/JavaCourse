package sectors.sec22.zad2;

public class Kolo implements Figury{
    private static final double PI = 3.14;
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double obwod(){
        return 2 * PI * r;
    }

    @Override
    public double pole(){
        return PI * r * r;
    }

}
