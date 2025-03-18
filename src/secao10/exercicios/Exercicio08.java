package secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int sum = 0, evens = 0;
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                sum += vect[i];
                evens++;
            }
        }

        if (evens == 0) {
            System.out.println("Nenhum número par");
        } else {
            double average = (double) sum / evens;
            System.out.printf("Média dos pares: %.1f", average);
        }

        sc.close();
    }
}
