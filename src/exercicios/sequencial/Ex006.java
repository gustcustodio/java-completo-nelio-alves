package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = sc.nextInt();

        System.out.printf("Valor de A: %d%n", a);
        System.out.printf("Valor de B: %d%n", b);

        int aux = a;
        a = b;
        b = aux;

        System.out.println("Trocando os valores...");
        System.out.printf("Agora A vale: %d%n", a);
        System.out.printf("Agora B vale: %d%n", b);

        sc.close();
    }
}
