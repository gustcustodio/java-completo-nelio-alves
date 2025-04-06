package secao13.challenge02;

import secao13.challenge02.entities.Company;
import secao13.challenge02.entities.Individual;
import secao13.challenge02.entities.TaxPayer;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // ! TESTES ! //
        TaxPayer taxPayer = new Individual(
                "Alex",
                50000.00,
                2000.00
        );

        System.out.printf("%.2f%n", taxPayer.tax());
        System.out.println();

        TaxPayer taxPayer1 = new Company(
                "SoftTech",
                400000.00,
                25
        );

        System.out.printf("%.2f%n", taxPayer1.tax());
        System.out.println();

        TaxPayer taxPayer2 = new Individual(
                "Bob",
                120000.00,
                1000.00
        );

        System.out.printf("%.2f%n", taxPayer2.tax());
    }
}
