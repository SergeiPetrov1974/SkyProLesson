package sky.pro_lesson_4;
/*
Мы решили написать астрономическое приложение, которое считает,
когда над Землей пролетают кометы и их можно будет увидеть.
Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей раз в 79 лет.
Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.

Условия задачи:
Для объявления текущего года создайте целочисленную переменную, равную 2021.
В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
Для вычисления периода можно создать две дополнительные переменные,
которые содержат год за 200 лет до текущего (из созданной ранее переменной)
в качестве старта и 100 лет после в качестве завершения периода расчета.
В результате решения задачи в консоль должен вывестись следующий результат:
1896
1975
2054
 */

public class Task3_4 {
    private int constantIntervalYear = 79;
    private int lastYear = 200;
    private int futureYear = 100;
    private int userYear;

    public Task3_4(int userYear) {
        this.userYear = userYear;
    }

    public void start() {
        startYear();
    }

    private void startYear() {
        for (int i = findLastYear(); i < userYear; i++) {
            if (i % constantIntervalYear == 0) {
                System.out.println(i);
            }
        }
        for (int j = userYear; j < findFutureYear(); j++) {
            if (j % constantIntervalYear == 0) {
                System.out.println(j);
            }
        }
    }

    private int findLastYear() {
        return userYear - lastYear;
    }

    private int findFutureYear() {
        return userYear + futureYear;
    }
}
