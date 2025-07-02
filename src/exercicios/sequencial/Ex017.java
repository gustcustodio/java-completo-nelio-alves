package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do raio da circunferência: ");
        double r = sc.nextDouble();

        double a = Math.PI * Math.pow(r, 2);

        System.out.printf("Resultado da área da circunferência: %.2f%n", a);

        sc.close();
    }
}
