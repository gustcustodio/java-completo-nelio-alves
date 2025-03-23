package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o valor da prestação: ");
        double valorPrestacao = sc.nextDouble();
        System.out.print("Informe a taxa por atraso: ");
        double taxaPorAtraso = sc.nextDouble();
        System.out.print("Informe o tempo de atraso (em dias): ");
        double tempoDeAtraso = sc.nextInt();

        double prestacaoEmAtraso =
                valorPrestacao + (valorPrestacao * (taxaPorAtraso / 100) * tempoDeAtraso);

        System.out.printf("%nValor da prestação em atraso: R$%.2f%n", prestacaoEmAtraso);

        sc.close();
    }
}
