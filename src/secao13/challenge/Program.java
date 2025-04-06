package secao13.challenge;

import secao13.challenge.entities.ImportedProduct;
import secao13.challenge.entities.Product;
import secao13.challenge.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.printf("Product #%d data: %n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeOfProduct = sc.next().charAt(0);
            sc.nextLine();

            if (typeOfProduct == 'c') {
                System.out.print("Name: ");
                String nameOfProduct = sc.nextLine();
                System.out.print("Price: ");
                double priceOfProduct = sc.nextDouble();
                products.add(new Product(
                        nameOfProduct,
                        priceOfProduct)
                );
            } else if (typeOfProduct == 'i') {
                System.out.print("Name: ");
                String nameOfProduct = sc.nextLine();
                System.out.print("Price: ");
                double priceOfProduct = sc.nextDouble();
                System.out.print("Customs fee: ");
                double feeOfProduct = sc.nextDouble();
                products.add(new ImportedProduct(
                        nameOfProduct,
                        priceOfProduct,
                        feeOfProduct)
                );
            } else if (typeOfProduct == 'u') {
                System.out.print("Name: ");
                String nameOfProduct = sc.nextLine();
                System.out.print("Price: ");
                double priceOfProduct = sc.nextDouble();
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.nextLine();
                products.add(new UsedProduct(
                        nameOfProduct,
                        priceOfProduct,
                        LocalDate.parse(manufactureDate, fmt))
                );
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
