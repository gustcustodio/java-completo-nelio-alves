package secao08.exercicios;

import secao08.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Digite o nome do aluno: ");
        student.name = sc.nextLine();
        System.out.print("Informe a nota do primeiro trimestre: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Informe a nota do segundo trimestre: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Informe a nota do terceiro trimestre: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f", student.finalGrade());
        System.out.println();

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
