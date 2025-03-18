package secao10.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        int older = 0, indexOlder = 0;
        int[] ages = new int[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            sc.nextLine();

            if (ages[i] > older) {
                older = ages[i];
                indexOlder = i;
            }
        }

        System.out.println("Pessoa mais velha: " + names[indexOlder]);

        sc.close();
    }
}
