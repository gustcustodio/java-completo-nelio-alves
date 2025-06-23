package secao17.generics1.application;

import secao17.generics1.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = scanner.nextInt();
            ps.addValue(value);
        }

        ps.print();

        Integer x = ps.first();
        System.out.printf("%nFirst: %d", x);

        scanner.close();
    }
}
