package secao15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula156 {
    public static void main(String[] args) {
        String path = "C:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException exception) {
            System.out.print("Error: " + exception.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
