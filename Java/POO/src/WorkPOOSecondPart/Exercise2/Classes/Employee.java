package WorkPOOSecondPart.Exercise2.Classes;

public class Employee extends Person {
    private double salary;
    private int idEmployee;

    public Employee(String name, int age, String CC, int idEmployee, double salary) {
        super(name, age, CC);
        this.idEmployee = idEmployee;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", idEmployee=" + idEmployee +
                '}';
    }
}
