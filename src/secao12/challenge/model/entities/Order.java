package secao12.challenge.model.entities;

import secao12.challenge.model.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<OrderItem>();

    private static final DateTimeFormatter fmt =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return this.moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:").append("\n");
        sb.append("Order moment: ");
        sb.append(fmt.format(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
