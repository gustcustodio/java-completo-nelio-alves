package secao16;

import secao16.model.entities.CarRental;
import secao16.model.entities.Vehicle;
import secao16.model.services.BrazilTaxService;
import secao16.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Aula166 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        Vehicle vehicle = new Vehicle(carModel);
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental car = new CarRental(start, finish, vehicle);

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService =
                new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(car);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + car.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + car.getInvoice().getTax());
        System.out.println("Pagamento total: " + car.getInvoice().getTotalPayment());

        sc.close();
    }
}
