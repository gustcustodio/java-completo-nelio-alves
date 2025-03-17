package secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vect[i] = sc.nextDouble();
        }

        double sum = 0, media = 0;
        String output = "Valores: ";

        for (double v : vect) {
            output += v + " ";
            sum += v;
            media = sum / vect.length;
        }

        System.out.println(output);
        System.out.println("Soma: " + String.format("%.2f", sum));
        System.out.println("Media: " + String.format("%.2f", media));

        sc.close();
    }
}
