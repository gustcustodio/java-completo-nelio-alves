package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.print("Temperatura convertida para Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
