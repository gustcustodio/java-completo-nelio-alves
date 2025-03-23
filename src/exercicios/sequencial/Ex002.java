package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.print("Temperatura convertida para Celsius: "
                + String.format("%.2f", celsius));

        sc.close();
    }
}
