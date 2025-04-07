package secao13.challenge02;

import secao13.challenge02.entities.Company;
import secao13.challenge02.entities.Individual;
import secao13.challenge02.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayers = sc.nextInt();


        for (int i = 1; i <= numberOfTaxPayers; i++) {
            System.out.printf("Tax payer #%d data:%n", i);
            System.out.print("Individual or company (i/c)? ");
            char typeOfTaxPayer = sc.next().charAt(0);
            sc.nextLine();

            if (typeOfTaxPayer == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healtExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healtExpenditures));
            } else if (typeOfTaxPayer == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        double totalTaxes = 0.0;

        System.out.println("\nTAXES PAIDS: ");

        for (TaxPayer taxPayer : taxPayers) {
            totalTaxes += taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
        }

        System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

        sc.close();
    }
}
