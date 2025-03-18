package secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[] grade1 = new double[n];
        double[] grade2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: %n", i + 1);
            names[i] = sc.nextLine();
            grade1[i] = sc.nextDouble();
            grade2[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < n; i++) {
            double average = (grade1[i] + grade2[i]) / 2;

            if (average >= 6.0) {
                System.out.println(names[i]);
            }
        }

        sc.close();
    }
}
