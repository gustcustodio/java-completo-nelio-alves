package secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double smallestHeight, largestHeight = 0.0;

        char[] gender = new char[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %d pessoa: ", i + 1);
            height[i] = sc.nextDouble();
            System.out.printf("Gênero da %d pessoa: ", i + 1);
            gender[i] = sc.next().charAt(0);


            //            if (height[i] < smallestHeight) {
            //                smallestHeight = height[i];
            //            }

            if (height[i] > largestHeight) {
                largestHeight = height[i];
            }
        }

        //        System.out.println("Menor altura: " + smallestHeight);
        System.out.println("Maior altura: " + largestHeight);

        sc.close();
    }
}
