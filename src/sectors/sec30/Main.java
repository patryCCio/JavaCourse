package sectors.sec30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String PATH = "C:\\Users\\xmoon\\IdeaProjects\\demo\\JavaCourse\\src\\sectors\\sec30\\fragment.txt";

    public static void main(String[] args) {
        choiceOption();
    }
    private static void choiceOption(){
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while(option != 3){
            System.out.println("Wybierz opcję:");
            System.out.println("1. Odczyt pliku fragment.txt");
            System.out.println("2. Znajdź wszystkie i wypisz nr linii wraz z całą linią tam gdzie znajduje się szukany tekst");
            System.out.println("3. Exit");
            System.out.print("Wybór: " );
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    readText();
                    break;
                case 2:
                    String text;
                    System.out.print("Szukana fraza: ");
                    text = sc.nextLine();
                    System.out.println();
                    getText(text);
                    break;
                case 3:
                    System.out.println("Zamykam program!");
                    break;
            }
        }
        sc.close();
    }

    private static void readText(){
        int valueOfCharacters = 0;
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linia;
            while((linia = bufferedReader.readLine())!= null){
                System.out.println(linia);
                valueOfCharacters += linia.length();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Nie ma takiego pliku!");
        } catch (IOException e) {
            System.err.println("Coś poszło nie tak!");
        }
        System.out.println("Ilość znaków: " + valueOfCharacters);
        System.out.println();
    }

    private static void getText(String text){
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int numberOfLine = 0;
            String line;
            while((line = bufferedReader.readLine()) != null){
                if(line.contains(text)){
                    System.out.println("<" + numberOfLine + "> | <" + text + ">: " + line);
                    numberOfLine++;
                }
            }
            System.out.println("Ilość linii: " + numberOfLine);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
