package secao15;

import java.io.File;
import java.util.Scanner;

public class Aula159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // listando pastas //
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }
        // listando arquivos //
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }
        // criando uma pasta //
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
