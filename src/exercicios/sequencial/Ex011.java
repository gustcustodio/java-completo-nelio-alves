package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a cotação do dólar: US$");
        double cotacaoDolar = sc.nextDouble();
        System.out.print("Informe a quantidade de doláres que deseja converter: US$");
        double quantidadeDolar = sc.nextDouble();

        double quantidadeReais = quantidadeDolar * cotacaoDolar;

        System.out.printf
                ("O valor de US$%.2f doláres é igual R$%.2f reais",
                        quantidadeDolar,
                        quantidadeReais);

        sc.close();
    }
}
