package sectors.sec29.wczytywanieZPliku;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\xmoon\\IdeaProjects\\demo\\JavaCourse\\src\\sectors\\sec29\\wczytywanieZPliku\\file.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku!");
        }

        String path = "C:\\Users\\xmoon\\IdeaProjects\\demo\\JavaCourse\\src\\sectors\\sec29\\wczytywanieZPliku\\file.txt";
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku!");
        } catch (IOException e){
            System.err.println("Problem z wczytaniem pliku!");
        }

    }
}
