package sectors.sec26.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Podaj nazwisko: ");
        String surname = scanner.nextLine();
        System.out.println();

        System.out.print("Podaj wzrost: ");
        int height = scanner.nextInt();
        System.out.println();

        System.out.println("Jestem " + name + " " + surname + ", mój wzrost to: " + height);
        scanner.close();
    }
}
