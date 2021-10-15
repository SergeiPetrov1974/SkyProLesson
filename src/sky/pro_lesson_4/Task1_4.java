package sky.pro_lesson_4;
/*
### Задание 1
Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
Не забудьте выполнить переход на новую строку между двумя циклами.
В результате программы вывод должен получиться следующий:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1
 */

public class Task1_4 {
    private int userNumber;
    private int i = 1;

    public Task1_4(int userNumber) {
        this.userNumber = userNumber;
    }

    public void start() {
        operatorUsed();
    }

    private void operatorUsed() {
        while (i < userNumber + 1) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
        for (int j = i - 1; j > 0; j--) {
            System.out.print(j + " ");

        }
    }
}
