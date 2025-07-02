package secao18.exercicio.proposto.application;

import secao18.exercicio.proposto.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Temp\\aula203.txt";

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String employeeName = fields[0];
                String employeeMail = fields[1];
                Double employeeSalary = Double.parseDouble(fields[2]);

                employees.add(new Employee(employeeName, employeeMail, employeeSalary));

                line = br.readLine();
            }

            List<String> emailsList = employees
                    .stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .collect(Collectors.toList());

            double sumOfSalary = employees
                    .stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.printf("Email of people whose salary is more than %.2f:%n", salary);
            emailsList.forEach(System.out::println);

            System.out.printf
                    ("Sum of salary of people whose name starts with 'M': %.2f", sumOfSalary);

        } catch (IOException e) {
            System.err.print("Error: " + e.getMessage());
        }

        sc.close();
    }
}
