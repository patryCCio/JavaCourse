package sectors.sec20.zad2;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try{
            System.out.println("a = " + a + ", b = " + b);
            System.out.println("a / b = " + divideTwoNumbers(a, b));
        }catch (ArithmeticProblemException e){
            System.err.println("Nie wolno dzielić przez 0!");
        }
    }

    public static int divideTwoNumbers(int a, int b) throws ArithmeticProblemException {
        if(b==0){
            throw new ArithmeticProblemException();
        }
        return a/b;
    }
}
