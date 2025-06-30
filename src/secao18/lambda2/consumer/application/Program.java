package secao18.lambda2.consumer.application;

import secao18.lambda2.consumer.entities.Product;
import secao18.lambda2.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        final double FACTOR = 1.1;

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Consumer<Product> productConsumer =
                product -> product.setPrice(product.getPrice() * FACTOR);

        // * implementação da interface * //
        // list.forEach(new PriceUpdate());
        // * reference method com método estático * //
        // list.forEach(Product::staticPriceUpdate);
        // * reference method com método não estático * //
        // list.forEach(Product::nonStaticPriceUpdate);
        // * expressão lambda declarada * //
        // list.forEach(productConsumer);
        // * expressão lambda inline * //
        list.forEach(product -> product.setPrice(product.getPrice() * FACTOR));

        list.forEach(System.out::println);
    }
}
