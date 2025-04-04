package secao13.exercise;

import secao13.exercise.entities.Employee;
import secao13.exercise.entities.OutsourcedEmployee;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d data:%n", i);
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Valur per hour: ");
            double valuePerHour = sc.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee employee =
                        new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                list.add(employee);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee employee : list) {
            System.out.println(
                    employee.getName() + " - $ " + String.format("%.2f", employee.payment())
            );
        }

        sc.close();
    }
}
