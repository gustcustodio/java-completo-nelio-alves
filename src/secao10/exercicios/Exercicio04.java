package secao10.exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int evens = 0;
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros pares:");
        for (int v : vect) {
            if (v % 2 == 0) {
                System.out.print(v + " ");
                evens++;
            }
        }

        System.out.print("\n\nQuantidade da pares: " + evens);

        sc.close();
    }
}
