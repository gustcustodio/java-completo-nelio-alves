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
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("ID already taken! Try again: ");
                id = sc.nextInt();
            }


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

        Employee employee = list
                .stream()
                .filter(x -> x.getId() == idSalaryIncrease)
                .findFirst()
                .orElse(null);

        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            employee.increaseSalary(percent);
        }

        // showing data //
        System.out.println();
        System.out.println("List of employees: ");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee employee = list
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);

        return employee != null;
    }

}
