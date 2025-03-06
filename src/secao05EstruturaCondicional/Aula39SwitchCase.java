package secao05EstruturaCondicional;

import java.util.Scanner;

public class Aula39SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do dia da semana: ");
        int x = sc.nextInt();

        String dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terca";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sabado";
            default -> "valor invalido";
        };

        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}