package secao05EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07Parte2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;
        String output;

        System.out.print("Informe o valor de X: ");
        x = sc.nextDouble();
        System.out.print("Informe o valor de Y: ");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            output = "Origem";
        } else if (x == 0.0) {
            output = "Eixo Y";
        } else if (y == 0.0) {
            output = "Eixo X";
        } else if (x > 0.0 && y > 0.0) {
            output = "Q1";
        } else if (x < 0.0 && y > 0.0) {
            output = "Q2";
        } else if (y < 0.0 && x < 0.0) {
            output = "Q3";
        } else {
            output = "Q4";
        }

        System.out.print(output);

        sc.close();
    }
}
