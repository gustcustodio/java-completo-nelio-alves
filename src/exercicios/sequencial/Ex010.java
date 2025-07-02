package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = sc.nextInt();

        double dif = Math.pow((a - b), 2);

        System.out.printf("Quadrado da diferença entre A e B: %.2f", dif);

        sc.close();
    }
}
