package secao18.lambda2.predicate.util;

import secao18.lambda2.predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
