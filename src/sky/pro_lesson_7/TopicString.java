package sky.pro_lesson_7;

import java.util.Arrays;

public class TopicString {
    public static void main(String[] args) {
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
        Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
        и бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
        Напишите четыре строки:
        первая с именем firstName — для хранения имени;
        вторая с именем middleName — для хранения отчества;
        третья с именем lastName — для хранения фамилии;
        четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        Выведите в консоль фразу: “ФИО сотрудника — ….”
        В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
         */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — '" + fullName + "'");
    }

    private static void task2() {
        /*
        Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны    Ф. И. О. сотрудников,
        полностью написанные заглавными буквами (верхним регистром).
        Напишите программу, которая изменит написание Ф. И. О. сотрудника с  “Ivanov Ivan Ivanovich”
        на полностью заглавные буквы.
        В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
         */

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — '" + fullNameUpper + "'");
    }

    public static void task3() {
        /*
        Коллегам из административного отдела тоже нужны данные Ф. И. О. всех сотрудников для пропусков в офис.
        Они попросили написать программу, в которой данные Ф. И. О. сотрудников
        будут храниться в формате "Фамилия; Имя; Отчество"
        Напишите программу, которая изменит написание Ф. И. О.
        сотрудника с  “Ivanov Ivan Ivanovich” на необходимый формат (через точку с запятой).
        В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате :”Данные ФИО сотрудника для административного отдела — …”
         */

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameReplace = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameReplace);
    }

    public static void task4() {
        /*
        Система, в которой мы работаем, не принимает символ “ё”.
        Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ….”
        - **Подсказка**
        Может потребоваться метод split() и метод contains().
         */
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameReplace = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);
        System.out.println("Данные ФИО сотрудника - " + fullNameReplace);
    }

    public static void task5() {
        /*
        Задание 5**
        К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку
        с Ф. И. О. на три — на фамилию, имя и отчество.
        В качестве исходных данных используйте:
        Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        переменная firstName — для хранения имени;
        переменная middleName — для хранения отчества;
        переменная lastName — для хранения фамилии.
        Решите задание с помощью метода substring().
        Результат программы выведите в формате:
        “Имя сотрудника — …”
        “Фамилия сотрудника — …”
        “Отчество сотрудника — ...”
        **Важно**: «в голове» высчитывать позиции пробелов  и параметров для обрезания строки запрещено. 
        Их должен вычислить компьютер.
        - **Подсказка**
        Определить индексы символов помогут методы indexOf() и lastIndexOf().
         */

        System.out.println("Решение № 1");

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String[] fullName = {firstName, lastName, middleName};
        int sizeWord = fullName.length;
        for (int i = 0; i < sizeWord; i++) {
            if (fullName[i].equals(firstName)) {
                System.out.println("Имя сотрудника - " + fullName[i]);
            } else if (fullName[i].equals(lastName)) {
                System.out.println("Фамилия сотрудника - " + fullName[i]);
            } else {
                System.out.println("Отчество сотрудника - " + fullName[i]);
            }
        }
        System.out.println();
        System.out.println("Решение № 2");
        String fullNameNext = "Ivanov Ivan Ivanovichv";
        String firstNameNext = fullNameNext.substring(0, fullNameNext.indexOf(" "));
        String lastNameNext = fullNameNext.substring(fullNameNext.indexOf(" ") + 1, fullNameNext.lastIndexOf(" ") + 1);
        String middleNameNext = fullNameNext.substring(fullNameNext.lastIndexOf(" ") + 1);
        System.out.println("Фамилия сотрудника - " + firstNameNext);
        System.out.println("Имя сотрудника - " + lastNameNext);
        System.out.println("Отчество сотрудника - " + middleNameNext);
    }

    public static void task6() {
        /*
        Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
        Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв
         Ф. И. О. в правильный формат.
        В качестве исходных данных используйте строку fullName c данными  “ivanov ivan ivanovich“,
        которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
        Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв —  …”
        - **Подсказка 1**
        Метод toCharArray() может быть полезен.
        - **Подсказка 2**
        Для преобразования символа в верхний регистр следует использовать метод  Character.toUpperCase(c), где c — символ.
         */
        String fullName = "ivanov ivan ivanovichv";
        String[] words = fullName.split(" ");      // разделить каждое слово из вышеприведенной строки
        System.out.println(Arrays.toString(words));
        String capitalizedWord = "";
        for (String word : words) {
            String first = word.substring(0, 1); //получить первый символ каждого слова
            String nextFirst = word.substring(1); //получить оставшийся символ соответствующего слова
            capitalizedWord += first.toUpperCase() + nextFirst + " ";
        }
        System.out.println(capitalizedWord);
    }

    public static void task7() {
        /*
        ### **Повышенная сложность. Задание 7**
        Имеется две строки.
        Первая: "135"
        Вторая: "246"
        Соберите из двух строк одну, содержащую данные "123456".
        Использовать сортировку нельзя.
        Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        Выведите результат в консоль в формате: “Данные строки — ….”
        - **Подсказка**
        Следует использовать StringBuilder.
         */
        String firstWord = "135";
        String secondWord = "246";
        String unionLine = firstWord + secondWord;
        //System.out.println(unionLine);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("135");
        stringBuilder.append("246");
        String builder = stringBuilder.toString();
        System.out.println(builder);

        char[] chars = builder.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
    }

    public static void task8() {
        /*
        ### Повышенная сложность. Задание 8
        Дана строка из букв английского алфавита  "aabccddefgghiijjkk".
        Нужно найти и напечатать буквы, которые дублируются в строке.
        Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
        В итоге в консоль должен быть выведен результат программы: "acdgijk".
        - Критерии оценки
        – Данные в строке отсортированы корректно.
        – При изменении содержания строки результат программы выполняется.
        – Результат программы выведен в консоль согласно условиям задачи.
         */
        String s = "aabccddefgghiijjkk";
        char[] string = s.toCharArray();
        String show = "Повторяющиеся символы: ";
        for (int i = 0; i < string.length; i++) {
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j]) {
                    System.out.println(show + string[j]);
                }
            }
        }
    }
}
