package secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int index = 0;
        double higherValue = 0;
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextDouble();

            if (vect[i] > higherValue) {
                higherValue = vect[i];
                index = i;
            }
        }

        System.out.print("\nMaior valor: " + higherValue);
        System.out.print("\nPosição do maior valor: " + index);

        sc.close();
    }
}
