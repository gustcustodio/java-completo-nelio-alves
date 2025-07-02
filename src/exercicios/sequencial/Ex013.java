package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Informe o valor de C: ");
        int c = sc.nextInt();

        int soma = (a * a) + (b * b) + (c * c);

        System.out.printf("Soma dos quadrados dos valores informados: %d%n", soma);

        sc.close();
    }
}

