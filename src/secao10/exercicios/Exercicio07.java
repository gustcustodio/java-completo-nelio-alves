package secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0, average = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        average = sum / vect.length;

        System.out.printf("Média do vetor: %.3f", average);
        System.out.println("\nElementos abaixo da média: ");
        for (double v : vect) {
            if (v < average) {
                System.out.printf("%.1f%n", v);
            }
        }

        sc.close();
    }
}
