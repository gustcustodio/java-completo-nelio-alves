package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Informe o valor de C: ");
        int c = sc.nextInt();
        System.out.print("Informe o valor de D: ");
        int d = sc.nextInt();

        int p = a * c;
        int s = b + d;

        System.out.printf("%nProduto do primeiro com o terceiro valor: %d%n", p);
        System.out.printf("Soma do segundo com o quarto valor: %d%n", s);

        sc.close();
    }
}
