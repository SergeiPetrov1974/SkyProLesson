package sky.pro_lesson_4;
/*
В вашей компании пятница является днем отчетным.
Нам нужно написать программу, которая считает дни месяца по датам, определяет,
какой день пятница, и выводит сообщение с напоминанием о том, что нужно подготовить еженедельный отчет.

Условия задачи:
Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
"Сегодня пятница, ...-е число. Необходимо подготовить отчет."
В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
 */

public class Task2_4 {
    private int userDayReport;
    private int userDayMonth;
    private boolean isCorrectValue = true;

    public Task2_4(int userDayReport, int userDayMonth) {
        this.userDayReport = userDayReport;
        this.userDayMonth = userDayMonth;
    }

    public void start() {
        checkData();
    }

    private void checkData() {
        if (userDayReport == 0 || userDayReport > 7 && userDayMonth < 28 || userDayMonth > 31) {
            isCorrectValue = false;
            System.out.println(" Проверьте корректность ввода чисел ");
        } else {
            findDay();
        }
    }


    private void findDay() {
        for (int i = 0; i <= userDayMonth; i++) {
            if (i % 7 == 0) {
                i += userDayReport;
                if (i <= userDayMonth) {
                    System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет.");
                }
            }
        }
    }
}

