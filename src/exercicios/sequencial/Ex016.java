package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário mensal: R$");
        double sm = sc.nextDouble();
        System.out.print("Informe o percentual de reajuste: ");
        double pr = sc.nextDouble();

        double ns = sm + (sm * (pr / 100));

        System.out.printf("Novo salário: R$%.2f%n", ns);

        sc.close();
    }
}
