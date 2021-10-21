package sky.pro_lesson_6;

import java.util.Arrays;
import java.util.Random;

public class ArraysLessonSecond {
    public static void main(String[] args) {
        //test();
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        task8();
    }

    public static void task1() {
        /*
        Задание 1
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».
         */
        int totalSum = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        System.out.println(totalSum);
    }

    public static void task2() {
        /*
        Задание 2
        Следующая задача — найти минимальную и максимальную трату за день.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */
        int[] arr = generateRandomArray();
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minValue + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxValue + " рублей.");
    }

    public static void task3() {
        /*
        Задание 3
        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц
        (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей».
        **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
         */
        int[] arr = generateRandomArray();
        double average = 0;
        double totalSum = 0;
        for (int i : arr) {
            totalSum += i;
            average = totalSum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        /*
        Задание 4
        Отойдем от подсчетов.
        В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали отображаться в обратную сторону.
        Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        Данные с именами сотрудников хранятся в виде массива символов (char[]).
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
        **Важно**: не используйте дополнительные массивы для решения этой задачи.
        Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
         */
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
    }

    private static void task5() {
        /*
        Повышенная сложность. Задание 5
        Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
        Постарайтесь заполнить обе диагонали в одном цикле.
         */

        int[][] matrix = new int[3][3];
        int last = matrix.length - 1;
        for (int i = 0; i <= matrix.length - 1; i++) {
            matrix[i][i] = 1;
            matrix[i][last - i] = 1;
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        /*
        Повышенная сложность. Задание 6
        У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        Нам дан массив чисел: {5, 4, 3, 2, 1}
        Необходимо привести его к виду: {1, 2, 3, 4, 5}
        Решите задачу с использованием дополнительного массива.
        Напечатайте массив до преобразования и после с помощью
         */

        int[] arr = {5, 4, 3, 2, 1};
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArray));
    }

    private static void task7() {
        /*
        Повышенная сложность. Задание 7
        Решите предыдущее задание, но без использования дополнительного массива.
        Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        Выведите результат программы в консоль тем же способом.
         */
        int[] arr = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int step = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = step;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task8() {
        /*
        Очень сложно. Задание 8
        Задача, которая используется/бывает/встречается на собеседованиях.
        Дан массив чисел  {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        Необходимо найти два числа, сумма которых равна −2.
        Напечатать эти числа в консоль.
        - **Подсказка**
        Может потребоваться отсортировать массив с помощью Arrays.sort(arr).
         */
        /*
        нужно найти a + b + c = 0
         b + c = -a
         */
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int target = -2;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] - arr[j] == target) {
                    int[] value = {i, j};
                    System.out.println(Arrays.toString(value));
                }
            }
        }
    }

    public static void test() {
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Затраты за " + (i + 1) + " день " + arr[i]);
        }
    }

    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
}
