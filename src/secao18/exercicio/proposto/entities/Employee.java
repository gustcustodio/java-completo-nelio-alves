package secao18.exercicio.proposto.entities;

public class Employee implements Comparable<Employee> {
    private String name;
    private String email;
    private Double salary;

    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        return name.toUpperCase().compareTo(other.name.toUpperCase());
    }
}
