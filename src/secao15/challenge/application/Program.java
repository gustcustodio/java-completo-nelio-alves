package secao15.challenge.application;

import secao15.challenge.model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("File path: ");
        File sourceFile = new File(sc.nextLine());

        boolean success = new File(sourceFile.getParent() + "\\out").mkdir();

        String targetFile = sourceFile.getParent() + "\\out\\summary.csv";

        //        System.out.println("sourceFile: " + sourceFile);
        //        System.out.println("targetFile: " + targetFile);

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String item = br.readLine();
            while (item != null) {
                String[] fields = item.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                item = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
                for (Product i : list) {
                    bw.write(
                            i.getProductName()
                                    + "," + String.format("%.2f", i.totalPrice())
                    );
                    bw.newLine();
                }
                System.out.println(targetFile + " CREATED!");
            } catch (IOException exception) {
                System.out.println("Error writing file: " + exception.getMessage());
            }
        } catch (IOException exception) {
            System.out.println("Error reading file: " + exception.getMessage());
        }

        sc.close();
    }
}
