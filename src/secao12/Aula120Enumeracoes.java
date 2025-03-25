package secao12;

import secao12.entities.Order;
import secao12.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Scanner;

public class Aula120Enumeracoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order order = new Order(1080, LocalDate.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        System.out.print("Informe o status do pedido: ");
        String status = sc.nextLine();

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf(status);

        System.out.println(os1);
        System.out.println(os2);
    }
}
