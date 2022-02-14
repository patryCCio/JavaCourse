package sectors.sec26.zad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wczytuję liczby i ich sumę!");
        int x = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);

        do{
            result = result + x;
            System.out.println("Result: " + result);
            System.out.print("Podaj liczbę: ");
            x = sc.nextInt();
            sc.nextLine();
        }while(x>=0);
        System.out.println(x + " < 0 więc kończę działanie!");
        sc.close();
    }
}
