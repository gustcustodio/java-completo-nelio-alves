package secao18.lambda2.function.application;

import secao18.lambda2.function.entities.Product;
import secao18.lambda2.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Function<Product, String> function = product -> product.getName().toUpperCase();

        // * implementação da interface * //
        /*
        List<String> names =
                list.stream().map(new UpperCaseName()).collect(Collectors.toList());
         */
        // * reference method com método estático * //
        /* List<String> names =
                list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
         */
        // * reference method com método não estático * //
        /*
        List<String> names =
                list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        */
        // * expressão lambda declarada * //
        // List<String> names = list.stream().map(function).collect(Collectors.toList());
        // * expressão lambda inline * //
        List<String> names =
                list.stream()
                        .map(product -> product.getName().toUpperCase())
                        .collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
