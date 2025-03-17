package secao10.exercicios;

import secao10.entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        People[] vect = new People[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();

            vect[i] = new People(name, age, height);
        }

        int under16 = 0;
        double sum = 0, average, percentageUnder16;

        for (People p : vect) {
            sum += p.getHeight();

            if (p.getAge() < 16) {
                under16++;
            }
        }

        average = sum / vect.length;
        percentageUnder16 = ((double) under16 / n) * 100.0;

        System.out.println("Média de altura: "
                + String.format("%.2f", average));
        System.out.println("Pessoas com menos de 16 anos: "
                + String.format("%.2f", percentageUnder16)
                + "%");

        for (People p : vect) {
            if (p.getAge() < 16) {
                System.out.println(p.getName());
            }
        }

        sc.close();
    }
}
