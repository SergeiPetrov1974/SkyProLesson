package sky.pro_coursework;

public class Employee {
    private static int count = 0;
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    private int salary;
    private int idEmployee;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
        count++;
        idEmployee = count;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    public String getInfoEmployee() {
        return "Ф.И.О. сотрудника: " + fullName + "\nИдентификационный номер сотрудника id № " + idEmployee
                + "\nзарплата сотрудника: " + salary + " рублей. \n";
    }

    @Override
    public String toString() {
        return fullName;
    }
}
