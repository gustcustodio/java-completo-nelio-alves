package secao08.entities;

public class Student {
    public String name;
    public double grade1, grade2, grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        return 60.00 - finalGrade();
    }
}
