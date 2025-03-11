package secao08.exercicios;

import secao08.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarPrice, dollarsBought;

        System.out.print("What is the dollar price? ");
        dollarPrice = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        dollarsBought = sc.nextDouble();

        System.out.print("Amount to be paid in reais = "
                + String.format("%.2f",
                CurrencyConverter.dollarToReal(dollarPrice, dollarsBought)));

        sc.close();
    }
}
