package secao10.application;

import java.util.Arrays;
import java.util.Scanner;

public class Aula103Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print
                ("Informe a quantidade de linhas e colunas a ser digitada na matriz: ");
        int n = sc.nextInt();

        int countNegatives = 0;
        int[][] matriz = new int[n][n];

        // reading data and increasing countNegatives //
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0) {
                    countNegatives++;
                }
            }
        }

        System.out.println();

        // output of matriz //
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // output main diagonal //

        System.out.println("Main diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
        System.out.print("Negative numbers: " + countNegatives);

        sc.close();
    }
}
