package sky.pro_lesson_2;

public class Task5 {
    private String name;
    private int personSalary;
    private int personNewSalary;

    public Task5(String name, int personSalary) {
        this.name = name;
        this.personSalary = personSalary;
    }

    public void start() {
        show();
    }

    private int formulaPercentage() {
        return personSalary + (personSalary * 10) / 100;
    }

    private int totalSalaryYear() {
        return personSalary * 12;
    }

    private int totalNewSalaryYear() {
        return formulaPercentage() * 12;
    }

    private int newAnnualIncomeGrown() {
        return totalNewSalaryYear() - totalSalaryYear();
    }

    private void show() {
        System.out.println(name + " теперь получает " + formulaPercentage() + "рублей. Годовой доход вырос на "
                + newAnnualIncomeGrown() + "рублей.");
    }
}
