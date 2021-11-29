package sky.pro_coursework;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String nameCompany;
    private List<Department> listDepartment = new ArrayList<>();
    private int count;
    private int newSalary;


    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void addDepartment(Department department) {
        listDepartment.add(department);
        count++;
    }

    public void totalSalary() {
        int total = 0;
        for (int i = 0; i < listDepartment.size(); i++) {
            total += listDepartment.get(i).getTotalSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + total + " рублей.");
    }

    public void averageSalary() {
        double totalSum = 0;
        for (Department department : listDepartment) {
            totalSum += department.getAverageSalary();
        }

        double average = totalSum / count;
        System.out.println("Средняя зарплата: " + average + " рублей.");
    }


    public void minSalary() {
        int minSal = 0;
        String string = null;
        for (Department department : listDepartment) {
            minSal = department.getMinSalary().getSalary();
        }
        for (Department department : listDepartment) {
            if (department.getMinSalary().getSalary() < minSal) {
                string = department.getMinSalary().getInfoEmployee();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + string);
    }


    public void maxSalary() {
        int maxS = 0;
        String string = null;
        for (Department department : listDepartment) {
            maxS = department.getMaxSalary().getSalary();
        }
        for (Department department : listDepartment) {
            if (department.getMaxSalary().getSalary() > maxS) {
                string = department.getMaxSalary().getInfoEmployee();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + string);
    }


    public void minSalaryEmployeeByDepart() {
        for (Department department : listDepartment) {
            System.out.println("Сотрудники с минимальной зарплатой в отделах: " + department.getMinSalary().getInfoEmployee());
        }
    }

    public void maxSalaryEmployeeByDepart() {
        for (Department department : listDepartment) {
            System.out.println("Сотрудники с максимальной зарплатой отделах: " + department.getMaxSalary().getInfoEmployee());
        }
    }

    public void calculateNetSalary(Department department, int percentage) {
        Department[] departmentEmployee = getCurrentDepartmentEmployee(department);
        for (int i = 0; i < listDepartment.size(); i++) {
            //Department basicSalary = listDepartment.get(i).getSalary();
            listDepartment.get(i).setNewSalary(1 + percentage / 100);
        }
    }

    public void info() {
        System.out.println(" Название компании '" + nameCompany + "'");
        for (Department department : listDepartment) {
            department.getInfoDepartment();
        }
    }

    public void nameEmployee() {
        for (Department department : listDepartment) {
            department.getListNameEmployee();
        }
    }

    public void searchByName(String name) {
        for (Department department : listDepartment) {
            System.out.println(department.searchByName(name));
        }
    }

    private Department[] getCurrentDepartmentEmployee(Department departmentId) {
        Department[] departmentEmployee = new Department[10];
        for (int i = 0; i < listDepartment.size(); i++) {
            if (listDepartment.get(i).equals(departmentId)) {
                //departmentEmployee[i] = listDepartment.get(i).getSalary();
            }
        }
        return departmentEmployee;
    }
}
