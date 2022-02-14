package sectors.sec27.powtorka;

import sectors.sec27.powtorka.Samsung.UE43RU7172;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tvService();
    }

    private static void tvService() {
        Scanner sc = new Scanner(System.in);
        UE43RU7172 tv1 = new UE43RU7172("Unique");

        int option = 0;

        System.out.println("1. Włącz; 2. Wyłącz; 3. Zmień program; 4. Zakończ;");
        while (option != 4) {
            option = sc.nextInt();

            switch (option) {
                case 1:
                    tv1.turnOn();
                    break;
                case 2:
                    tv1.turnOff();
                    break;
                case 3:
                    System.out.println("Podaj numer programu: ");
                    int number = sc.nextInt();
                    tv1.switchCanal(number);
                    break;
                case 4:
                    System.out.println("Zamykam program!");
                    System.exit(0);
                    break;
            }
        }
    }
}
