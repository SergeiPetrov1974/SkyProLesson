package sky.pro_lesson_3;
/*
Напишите программу, которая определяет, является ли год високосным или нет.
Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
« …. год является високосным».
или
«... год не является високосным».
Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
Также високосным является каждый четырехсотый год.
 */

public class Task3_3 {
    private int leapYear;

    public Task3_3(int leapYear) {
        this.leapYear = leapYear;
    }

    public void start() {
        show();
    }

    private boolean isLeapYear() {
        return (leapYear % 4 == 0) && (leapYear % 100 > 0) || (leapYear % 400 == 0);
    }

    private void show() {
        if (isLeapYear()) {
            System.out.println(leapYear + " год является високосным.");
        } else {
            System.out.println(leapYear + " год не является високосным.");
        }
    }
}
