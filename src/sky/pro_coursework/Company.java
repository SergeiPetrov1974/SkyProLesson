package sky.pro_coursework;

import java.util.ArrayList;

public class Company {
    private String nameCompany;
    private ArrayList<Department> listDepartment = new ArrayList<>();
    private int count;
    private double min = 0;
    private double max = 0;

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void addDepartment(Department department) {
        listDepartment.add(department);
        count++;
    }

    public void totalSalary() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += listDepartment.get(i).getTotalSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + total + " рублей.");
    }

    public void averageSalary() {
        double average = 0;
        double totalSum = 0;
        for (Department department : listDepartment) {
            totalSum += department.getAverageSalary();
            average = totalSum / count;
        }
        System.out.println("Средняя зарплата: " + average + " рублей.");
    }

    public void minSalary() {
        double minSalary = Double.POSITIVE_INFINITY;
        for (Department department : listDepartment) {
            if (minSalary > department.getMinSalary()) {
                minSalary = department.getMinSalary();
                min = minSalary;
            }
        }
        //System.out.println("Минимальная зарплата: " + minSalary + " рублей.");
    }

    public void maxSalary() {
        double maxSalary = Double.NEGATIVE_INFINITY;
        for (Department department : listDepartment) {
            if (maxSalary < department.getMaxSalary()) {
                maxSalary = department.getMaxSalary();
                max = maxSalary;
            }
        }
        //System.out.println("Максимальная зарплата: " + maxSalary + " рублей.");
    }

    public void showEmployeeMinSalary() {
        for (Department department : listDepartment) {
            department.filterMinValue(min);
        }
    }

    public void showEmployeeMaxSalary() {
        for (Department department : listDepartment) {
            department.filterMaxValue(max);
        }
    }
/*
    public void info() {
        System.out.println(" Название компании '" + nameCompany + "'");
        for (Department department : listDepartment) {
            department.infoDepartment();
        }
    }
 */
}
