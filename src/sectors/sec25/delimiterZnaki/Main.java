package sectors.sec25.delimiterZnaki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");

        System.out.println("Podaj coś z klawiatury: ");
        while(scanner.hasNext()){
            String next = scanner.next();
            System.out.println("Wczytałem: " + next);
        }
        System.out.println("Koniec działania progarmu");
        scanner.close();
    }
}
