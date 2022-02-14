package sectors.sec16.zad3;

public class Matma {
    public final static double PI = 3.14;

    public static double fieldRectangle(double a, double b){
        return a*b;
    }

    public static double circuitRectangle(double a, double b){
        return (2*a)+(2*b);
    }

    public static double fieldCircle(double r){
        return PI * r * r;
    }

    public static double circuitCircle(double r){
        return 2 * PI * r;
    }
}
