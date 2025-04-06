package secao13.challenge.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(Double price, Double customsFee) {
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        return super.getName()
                + " $ " + String.format("%.2f", totalPrice(super.getPrice(), customsFee))
                + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }
}
