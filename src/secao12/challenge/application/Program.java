package secao12.challenge.application;

import secao12.challenge.model.entities.Client;
import secao12.challenge.model.entities.Order;
import secao12.challenge.model.entities.OrderItem;
import secao12.challenge.model.entities.Product;
import secao12.challenge.model.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.next();

        Client client = new Client(name, email, LocalDate.parse(birthDate, fmt));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many items to this order? ");
        int N = sc.nextInt();

        Order order = new Order(LocalDateTime.now(), status, client);

        for (int i = 1; i <= N; i++) {
            System.out.printf("Enter #%d item data: %n", i);
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem ordemItem = new OrderItem(
                    productQuantity,
                    productPrice,
                    product
            );

            order.addItem(ordemItem);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
