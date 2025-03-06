package secao04EstruturaSequencial;

import java.util.Scanner;

public class Exercicio03Parte1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        D = sc.nextInt();

        DIFERENCA = A * B - C * D;

        System.out.printf("DIFERENÇA = %d", DIFERENCA);

        sc.close();
    }
}
