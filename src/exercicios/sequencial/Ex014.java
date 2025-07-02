package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Informe o valor de C: ");
        int c = sc.nextInt();

        int quadrado = (int) Math.pow(a + b + c, 2);

        System.out.printf("Quadrado da soma dos três valores informados: %d%n", quadrado);

        sc.close();
    }
}
