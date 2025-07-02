package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a cotação do dólar: US$");
        double cotacaoDolar = sc.nextDouble();
        System.out.print("Informe a quantidade de reais que deseja converter: R$");
        double quantidadeReais = sc.nextDouble();

        double quantidadeDolar = quantidadeReais / cotacaoDolar;

        System.out.printf
                ("O valor de R$%.2f reais é igual US$%.2f",
                        quantidadeReais,
                        quantidadeDolar);

        sc.close();
    }
}
