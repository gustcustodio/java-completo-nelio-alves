package secao15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula155 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException exception) {
            System.out.print("Error: " + exception.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }
}
