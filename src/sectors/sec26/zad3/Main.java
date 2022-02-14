package sectors.sec26.zad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Napisz tekst: ");
        String text = sc.nextLine();
        System.out.println();

        System.out.print("Podaj liczbę: ");
        int count = sc.nextInt();
        sc.nextLine();

        for(int x=0; x<count; x++){
            System.out.println((x+1) + ") " + text);
        }

        sc.close();
    }
}
