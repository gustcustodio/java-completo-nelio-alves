package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do raio da lata de óleo: ");
        double raio = sc.nextDouble();
        System.out.print("Informe o valor da altura da lata de óleo: ");
        double altura = sc.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.print("O valor do volume da lata de óleo é de: "
                + String.format("%.5f", volume));

        sc.close();
    }
}
