package secao16.exercicio.model;

import secao16.exercicio.model.entities.Contract;
import secao16.exercicio.model.entities.Installment;
import secao16.exercicio.model.services.ContractService;
import secao16.exercicio.model.services.PaypalServiceI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Aula170 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int contractNumber = sc.nextInt();
        System.out.print("Data (dd/MM/yy): ");
        LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        System.out.print("Entre com o número de parcelas: ");
        int contractInstallments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalServiceI());

        contractService.processContract(contract, contractInstallments);

        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallment()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
