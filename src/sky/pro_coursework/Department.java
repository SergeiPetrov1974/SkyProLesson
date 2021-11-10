package sky.pro_coursework;

import java.util.ArrayList;

public class Department {
    private static int count = 0;
    private ArrayList<Employee> listEmployees = new ArrayList<>();
    private String nameDepartment;
    private int depCount;

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
        count++;
        depCount = count;
    }

    public void addEmployee(String name, int salary) {
        listEmployees.add(new Employee(name, salary));
    }

    public int getTotalSalary() {
        int total = 0;
        for (Employee listEmployee : listEmployees) {
            total += listEmployee.getSalary();
        }
        return total;
    }

    public int getAverageSalary() {
        double average = 0;
        double totalSum = 0;
        for (Employee listEmployee : listEmployees) {
            totalSum += listEmployee.getSalary();
            average = totalSum / listEmployees.size();
        }
        return (int) average;
    }

    public double getMinSalary() {
        double minSalary = Double.POSITIVE_INFINITY;
        for (Employee listEmployee : listEmployees) {
            if (minSalary > listEmployee.getSalary()) {
                minSalary = listEmployee.getSalary();
            }
        }
        return minSalary;
    }

    public double getMaxSalary() {
        double maxSalary = Double.NEGATIVE_INFINITY;
        for (Employee listEmployee : listEmployees) {
            if (maxSalary < listEmployee.getSalary()) {
                maxSalary = listEmployee.getSalary();
            }
        }
        return maxSalary;
    }

    public void filterMinValue(double num) {
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getSalary() == num) {
                System.out.println("Сотрудник с минимальной зарплатой: \n" + listEmployees.get(i).getInfoEmployee());
            }
        }
    }

    public void filterMaxValue(double num) {
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getSalary() == num) {
                System.out.println("Сотрудник с максимальной зарплатой: \n" + listEmployees.get(i).getInfoEmployee());
            }
        }
    }

    public void infoDepartment() {
        for (Employee listEmployee : listEmployees) {
            System.out.println(" Отдел: № " + depCount + " " + nameDepartment + " \n " + listEmployee.getInfoEmployee());
        }
    }

/*
    public int getAllSalary() {
        int allSalary = 0;
        for (int i = 0; i < listEmployees.size(); i++) {
            allSalary = listEmployees.get(i).getSalary();
            System.out.println(allSalary);
        }
        return allSalary;
    }


    public int getCountEmployee() {
        return listEmployees.size();
}

 */
}

