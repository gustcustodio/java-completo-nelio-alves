package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o comprimento da caixa: ");
        double comprimento = sc.nextDouble();
        System.out.print("Informe a largura da caixa: ");
        double largura = sc.nextDouble();
        System.out.print("Informe a altura da caixa: ");
        double altura = sc.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.printf("O volume da caixa retangular é: %.2f%n", volume);

        sc.close();
    }
}
