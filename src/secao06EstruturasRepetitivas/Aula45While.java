package secao06EstruturasRepetitivas;

import java.util.Scanner;

public class Aula45While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.print(soma);

        sc.close();
    }
}
