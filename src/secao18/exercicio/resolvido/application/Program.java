package secao18.exercicio.resolvido.application;

import secao18.exercicio.resolvido.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        String path = "C:\\Temp\\aula202.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String productName = fields[0];
                Double productPrice = Double.parseDouble(fields[1]);

                products.add(new Product(productName, productPrice));

                line = br.readLine();
            }

            double averagePrice = products.stream()
                    .map(Product::getPrice)
                    .reduce(0.0, Double::sum) / products.size();

            System.out.printf("Average price: %.2f%n%n", averagePrice);

            Comparator<String> comparator = Comparator.comparing(String::toUpperCase);

            List<String> names = products.stream()
                    .filter(product -> product.getPrice() < averagePrice)
                    .map(Product::getName)
                    .sorted(comparator.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.err.print("Error: " + e.getMessage());
        }

    }
}
