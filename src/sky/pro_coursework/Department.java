package sky.pro_coursework;

import java.util.ArrayList;
import java.util.List;

public class Department {
    Employee employee;
    private static int count = 0;
    private List<Employee> listEmployees = new ArrayList<>();
    private String nameDepartment;
    private int depCount;
    private int newSalary;

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
        double totalSum = 0;
        for (Employee listEmployee : listEmployees) {
            totalSum += listEmployee.getSalary();
        }
        double average = 0;
        average = totalSum / listEmployees.size();
        return (int) average;
    }

    public Employee getMinSalary() {
        if (listEmployees.isEmpty()) {
            return null;
        }
        Employee min = listEmployees.get(0);
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getSalary() < min.getSalary()) {
                min = listEmployees.get(i);
            }
        }
        return min;
    }

    public Employee getMaxSalary() {
        if (listEmployees.isEmpty()) {
            return null;
        }
        Employee max = listEmployees.get(0);
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getSalary() > max.getSalary()) {
                max = listEmployees.get(i);
            }
        }
        return max;
    }

    public void getInfoDepartment() {
        for (Employee listEmployee : listEmployees) {
            System.out.println(" Отдел: № " + depCount + " " + nameDepartment + " \n " + listEmployee.getInfoEmployee());
        }
    }

    public void getListNameEmployee() {
        for (Employee listEmployee : listEmployees) {
            System.out.println(" Фамилии сотрудников: " + listEmployee.toString());
        }
    }

    public String searchByName(String name) {
        String nameEmployee;
        for (int i = 0; i < listEmployees.size(); i++) {
            employee = listEmployees.get(i);
            nameEmployee = employee.getFullName().toLowerCase();
            if (nameEmployee.contains(name.toLowerCase())) {
                System.out.println(employee.getFullName());
            }
        }
        return "";
    }

    public int getCalculateNetSalary(double percentage) {
        for (Employee listEmployee : listEmployees) {
            double amount = listEmployee.getSalary() * (percentage / 100);
            newSalary = (int) (listEmployee.getSalary() + amount);
            return newSalary;

        }
        return 0;
    }

    public int size() {
        return listEmployees.size();
    }


    public int getCountEmployee() {
        return listEmployees.size();
    }

    public int getSalary() {
        return listEmployees.size();
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




 */
}

