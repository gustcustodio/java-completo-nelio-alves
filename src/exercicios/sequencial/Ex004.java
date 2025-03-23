package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tempo gasto na viagem (em horas): ");
        int tempo = sc.nextInt();
        System.out.print("Informe a velocidade média (km/h): ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.println("\nRelatório da viagem: ");
        System.out.printf("Velocidade média: %.2f km/h%n", velocidade);
        System.out.printf("Tempo gasto na viagem: %d hora(s)%n", tempo);
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Quantidade de litros utilizada na viagem: %.2f litros%n"
                , litrosUsados);

        sc.close();
    }
}
