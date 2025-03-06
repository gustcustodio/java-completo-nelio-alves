package secao07OutrosTopicos;

import java.util.Scanner;

public class Aula58BitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.print("6th bit is true");
        } else {
            System.out.print("6th bith is false");
        }

    }
}
