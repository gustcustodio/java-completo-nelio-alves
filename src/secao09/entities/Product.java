package secao09.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // constructor default //
    public Product() {

    }

    // exemplo de construtor //
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // exemplo de sobrecarga //
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // encapsulamento //
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name; // não é necessário usar o this //
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
    // /encapsulamento //

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
