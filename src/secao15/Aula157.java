package secao15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula157 {
    public static void main(String[] args) {
        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
