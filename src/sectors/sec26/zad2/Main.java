package sectors.sec26.zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";");

        String text;

        while(!(text = scanner.next()).toLowerCase().equals("x")){
            System.out.println(text);
        }

        scanner.close();
    }
}
