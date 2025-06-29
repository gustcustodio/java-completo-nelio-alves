package secao17.set.exercicio.proposto.application;

import secao17.set.exercicio.proposto.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Student> students = new HashSet<>();
        int userCode = 0;

        System.out.print("How many students for course A? ");
        int courseA = sc.nextInt();

        for (int i = 0; i < courseA; i++) {
            System.out.printf("%dº student: ", i + 1);
            userCode = sc.nextInt();
            students.add(new Student(userCode));
        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();

        for (int i = 0; i < courseB; i++) {
            System.out.printf("%dº student: ", i + 1);
            userCode = sc.nextInt();
            students.add(new Student(userCode));
        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();

        for (int i = 0; i < courseC; i++) {
            System.out.printf("%dº student: ", i + 1);
            userCode = sc.nextInt();
            students.add(new Student(userCode));
        }

        System.out.printf("%nTotal students: %d%n", students.size());

        sc.close();
    }
}
