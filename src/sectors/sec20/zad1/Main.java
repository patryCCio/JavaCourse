package sectors.sec20.zad1;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try{
            System.out.println("a = " + a + ", b = " + b);
            System.out.println("a / b = " + a/b);
        }catch (ArithmeticException e){
            System.err.println("Nigdy nie dziel przez 0!");
        }
    }
}
