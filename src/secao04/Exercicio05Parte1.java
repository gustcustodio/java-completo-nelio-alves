package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Parte1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo01, quantidade01, codigo02, quantidade02;
        double valor01, valor02, valorTotal;

        System.out.print("Digite o código da peça 1: ");
        codigo01 = sc.nextInt();
        System.out.print("Digite o número de peças 1: ");
        quantidade01 = sc.nextInt();
        System.out.print("Digite o valor de cada peça 1: ");
        valor01 = sc.nextDouble();

        System.out.print("Digite o código da peça 2: ");
        codigo02 = sc.nextInt();
        System.out.print("Digite o número de peças 2: ");
        quantidade02 = sc.nextInt();
        System.out.print("Digite o valor de cada peça 2: ");
        valor02 = sc.nextDouble();

        valorTotal = quantidade01 * valor01 + quantidade02 * valor02;

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

        sc.close();
    }
}
