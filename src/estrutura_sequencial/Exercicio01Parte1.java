package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio01Parte1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, resultado;

        System.out.print("Digite o primeiro número: ");
        x = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        y = sc.nextInt();
        resultado = x + y;
        System.out.print("SOMA = " + resultado);

        sc.close();
    }
}
