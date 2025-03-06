package secao04EstruturaSequencial;

import java.util.Scanner;

public class Aula27EntradaDeDados02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // consome a quebra de linha pendente (limpando o buffer de leitura)
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
