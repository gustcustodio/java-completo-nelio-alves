package secao04EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Parte1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number, hours;
        double perHour, salary;

        System.out.print("Digite o número do funcionário: ");
        number = sc.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        hours = sc.nextInt();
        System.out.print("Digite o valor recebido por hora: ");
        perHour = sc.nextDouble();

        salary = hours * perHour;

        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        sc.close();
    }
}
