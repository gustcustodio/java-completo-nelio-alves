package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Informe o valor de C: ");
        int c = sc.nextInt();
        System.out.print("Informe o valor de D: ");
        int d = sc.nextInt();

        System.out.println("\nCombinações possíveis:\n");

        System.out.printf("A + B = %d%n", a + b);
        System.out.printf("A + C = %d%n", a + c);
        System.out.printf("A + D = %d%n", a + d);
        System.out.printf("A * B = %d%n", a * b);
        System.out.printf("A * C = %d%n", a * c);
        System.out.printf("A * D = %d%n%n", a * d);

        System.out.printf("B + C = %d%n", b + c);
        System.out.printf("B + D = %d%n", b + d);
        System.out.printf("B * C = %d%n", b * c);
        System.out.printf("B * D = %d%n%n", b * d);

        System.out.printf("C + D = %d%n", c + d);
        System.out.printf("C * D = %d%n", c * d);

        sc.close();
    }
}
