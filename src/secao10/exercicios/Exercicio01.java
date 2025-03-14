package secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantos números você vai digitar (máximo 10)? ");
            n = sc.nextInt();

            if (n < 0 || n > 10) {
                System.out.println("Valor inválido!");
            }

        } while (n < 0 || n > 10);

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            int numero = sc.nextInt();

            vect[i] = numero;
        }

        System.out.println("Números negativos: ");

        for (int numero : vect) {
            if (numero < 0) {
                System.out.println(numero);
            }
        }

        sc.close();
    }
}
