package secao08.entities;

public class Employee {
    public String name;
    public double grossSalary, tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double increase = grossSalary * (percentage * 0.01);
        System.out.println("Updated data: "
                + this.name
                + ", $ "
                + String.format("%.2f", (netSalary() + increase)));
    }
}
