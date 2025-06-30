package secao18.lambda2.consumer.entities;

public class Product {
    private String name;
    private Double price;
    private final double FACTOR = 1.1;

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

    public static void staticPriceUpdate(Product product) {
        product.setPrice(product.getPrice() * product.FACTOR);
    }

    public void nonStaticPriceUpdate() {
        price = price * FACTOR;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
