package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Parte1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double area, raio;
        double pi = 3.14159;

        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2);
        System.out.printf("A = %.4f", area);

        sc.close();
    }
}
