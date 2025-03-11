package secao05;

import java.util.Scanner;

public class Exercicio03Parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int A = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.print("São múltiplos");
        } else {
            System.out.print("Não são múltiplos");
        }

        sc.close();
    }
}
