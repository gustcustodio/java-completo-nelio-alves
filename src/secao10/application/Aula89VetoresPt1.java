package secao10.application;

import java.util.Locale;
import java.util.Scanner;

public class Aula89VetoresPt1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0.0;
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f", avg);

        sc.close();
    }
}
