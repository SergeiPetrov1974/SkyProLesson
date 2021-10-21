package sky.pro_lesson_3;
/*
Расширим задачу с кредитованием.
Прежде чем выдавать кредиты наш банк проводит аудит и оценивает клиентов и их возможность выплачивать кредит.
Для того, чтобы вывести предварительное решение, нам необходимо использовать данные о возрасте, зарплате и желаемой сумме.

Правила следующие:
Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев.
Максимальный ежемесячный платеж — 50% от ЗП. Если возраст меньше 23, то добавляем 1% к ставке.
Если возраст меньше 30, то добавляем 0.5% к ставке. Если зарплата больше 80_000, уменьшаем ставку на 0.7%.
Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
Вводные данные: используйте переменные age = 25 для обозначения возраста,salary = 60_000 для обозначения зарплаты,
wantedSum = 330_000 для обозначения желаемой суммы кредита.
Подсчитайте и выведите ответ, одобрен кредит или нет. На основании зарплаты подсчитайте максимальный допустимый платеж.
Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту согласно процентной ставке,
то кредит одобрен, если меньше — отказан.
Пример ответа в консоль: «Максимальный платеж при ЗП *** равен *** рублей. Платеж по кредиту *** рублей.
Одобрено/отказано».
 */

public class Task7_3 {
    private int age;
    private int salary;
    private int wantedSum = 300000;
    private double percent = 10;
    private int data = 12;
    private int halfPercentSalary = 50;

    public Task7_3(int age, int salary, int wantedSum) {
        this.age = age;
        this.salary = salary;
        this.wantedSum = wantedSum;
    }

    public void start() {
        calculationRules();

    }

    private double calculationCredit() {
        double percentMonth = (percent / data / 100);
        return (int) (wantedSum * (percentMonth * Math.pow((1 + percentMonth), data)) / (Math.pow((1 + percentMonth), data) - 1));
    }

    private void calculationRules() {
        if (age < 18) {
            System.out.println("Мы не готовы выдать вам кредитную карту.");
        } else if (age < 23 && salary <= 80000) {
            percent = percent + 1.0;
            System.out.println(" Максимальный платеж при ЗП " + salary + " равен " + halfSalary() +
                    " рублей. Ваша процентная ставка " + percent + " %. Платеж по кредиту " + calculationCredit() + " рублей. " + acceptedOrDenied());
        } else if (age < 23) {
            percent = percent - 0.7;
            System.out.println(" Максимальный платеж при ЗП " + salary + " равен " + halfSalary() +
                    " рублей. Ваша процентная ставка " + percent + " %. Платеж по кредиту " + calculationCredit() + " рублей. " + acceptedOrDenied());
        } else if (age >= 23 && age <= 30 && salary < 80000) {
            percent = percent + 0.5;
            System.out.println(" Максимальный платеж при ЗП " + salary + " равен " + halfSalary() +
                    " рублей. Ваша процентная ставка " + percent + " %. Платеж по кредиту " + calculationCredit() + " рублей. " + acceptedOrDenied());
        } else if (age >= 23 && age < 30) {
            percent = (percent + 0.5) - 0.7;
            System.out.println(" Максимальный платеж при ЗП " + salary + " равен " + halfSalary() +
                    " рублей. Ваша процентная ставка " + percent + " %. Платеж по кредиту " + calculationCredit() + " рублей. " + acceptedOrDenied());
        } else if (age >= 30 && salary < 80000) {
            System.out.println(" Максимальный платеж при ЗП " + salary + " равен " + halfSalary() +
                    " рублей. Ваша процентная ставка " + percent + " %. Платеж по кредиту " + calculationCredit() + " рублей. " + acceptedOrDenied());
        } else if (age >= 30 && salary > 80000) {
            percent = percent - 0.7;
            System.out.println(" Максимальный платеж при ЗП " + salary + " равен " + halfSalary() +
                    " рублей. Ваша процентная ставка " + percent + " %. Платеж по кредиту " + calculationCredit() + " рублей. " + acceptedOrDenied());
        }
    }

    private int halfSalary() {
        return (salary / 100) * halfPercentSalary;
    }

    private String acceptedOrDenied() {
        if (calculationCredit() <= halfSalary()) {
            return "Одобрено.";
        } else {
            return "Отказано.";
        }
    }
}
