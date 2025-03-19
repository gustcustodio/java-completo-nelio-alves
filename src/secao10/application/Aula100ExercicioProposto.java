package secao10.application;

import secao10.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aula100ExercicioProposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        // reading data //
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d%n", i + 1);
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        // searching data and updating salary //
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalaryIncrease = sc.nextInt();


        // showing data //
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }
}
