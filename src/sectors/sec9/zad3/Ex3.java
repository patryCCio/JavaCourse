package sectors.sec9.zad3;

public class Ex3 {
    public static void main(String[] args) {
        char operator;
        operator = '/';
        int a = 5;
        int b = 3;
        double result = 0;

        switch (operator){
            case '+':
              result = a + b;
              break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = (double)a / (double)b;
                break;
            case '*':
                result = a * b;
                break;
        }
        System.out.println("Rezultat: " + result);
    }
}
