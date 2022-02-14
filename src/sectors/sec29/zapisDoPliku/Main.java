package sectors.sec29.zapisDoPliku;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\xmoon\\IdeaProjects\\demo\\JavaCourse\\src\\sectors\\sec29\\zapisDoPliku\\file.txt";;
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Jakis cos tam cos");
            bufferedWriter.newLine();
            bufferedWriter.write("Piszę");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
