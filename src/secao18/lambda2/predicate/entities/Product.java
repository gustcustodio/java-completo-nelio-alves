package secao18.lambda2.predicate.entities;

public class Product {
    private String name;
    private Double price;
    private final double MIN = 100.0;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product product) {
        return product.getPrice() >= product.MIN;
    }

    public boolean nonStaticProductPredicate() {
        return price >= MIN;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
