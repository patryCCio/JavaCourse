package sectors.sec16.zad3;

public class MathClass {
    public static void main(String[] args) {
        double a = 5, b = 3, r = 3;

        System.out.println("Pole prostokąta o bokach a = " + a + ", b = " + b + " jest równe: " + Matma.fieldRectangle(a, b));
        System.out.println("Obwód tego prostokąta: " + Matma.circuitRectangle(a, b));
        System.out.println();
        System.out.println("Pole koła o promieniu r = " + r + " jest równe: " + Matma.fieldCircle(r));
        System.out.println("Obwód tego koła: " + Matma.circuitCircle(r));
    }
}
