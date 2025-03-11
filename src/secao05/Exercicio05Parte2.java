package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Parte2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        byte codigo = sc.nextByte();
        System.out.print("Digite a quantidade do produto informado: ");
        byte quantidade = sc.nextByte();

        double total = switch (codigo) {
            case 1 -> 4.00 * quantidade;
            case 2 -> 4.50 * quantidade;
            case 3 -> 5.00 * quantidade;
            case 4 -> 2.00 * quantidade;
            case 5 -> 1.50 * quantidade;
            default -> 0.00;
        };

        System.out.printf("Total: R$ %.2f", total);

        sc.close();
    }
}
