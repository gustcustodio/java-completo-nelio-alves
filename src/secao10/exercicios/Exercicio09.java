package secao10.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        String[] names = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:");
        }

        sc.close();
    }
}
