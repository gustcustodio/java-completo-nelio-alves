package secao18.lambda2.predicate.application;

import secao18.lambda2.predicate.entities.Product;
import secao18.lambda2.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        final double MIN = 100.0;

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Predicate<Product> productPredicate = product -> product.getPrice() >= MIN;

        // * implementação da interface * //
        // list.removeIf(new ProductPredicate());
        // * reference method com método estático * //
        // list.removeIf(Product::staticProductPredicate);
        // * reference method com método não estático * //
        // list.removeIf(Product::nonStaticProductPredicate);
        // * expressão lambda declarada * //
        // list.removeIf(productPredicate);
        // * expressão lambda inline * //
        list.removeIf(product -> product.getPrice() >= MIN);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
