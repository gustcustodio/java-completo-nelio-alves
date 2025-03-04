package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula26EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //        String x;
        //        int x;
        //        double x;
        //        char x;
        String x;
        int y;
        double z;

        //        x = sc.next(); -> para strings
        //        x = sc.nextInt(); -> para int
        //        x = sc.nextDouble(); -> para double
        //        x = sc.next().charAt(0); -> para char
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
