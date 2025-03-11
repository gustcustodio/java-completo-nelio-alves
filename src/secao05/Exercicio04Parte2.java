package secao05;

import java.util.Scanner;

public class Exercicio04Parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        System.out.print("Digite a hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Digite a hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        sc.close();
    }
}
