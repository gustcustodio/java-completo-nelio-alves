package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        System.out.printf("%d elevado ao quadrado é igual a: %.2f", numero, Math.pow(numero, 2));

        sc.close();
    }
}
