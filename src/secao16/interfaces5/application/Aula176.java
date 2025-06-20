package secao16.interfaces5.application;

import secao16.interfaces5.services.BrazilInterestService;
import secao16.interfaces5.services.IInterestService;
import secao16.interfaces5.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Aula176 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        IInterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.printf("%.2f%n", payment);

        sc.close();
    }
}
