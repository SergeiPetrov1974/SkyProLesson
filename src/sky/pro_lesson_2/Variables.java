package sky.pro_lesson_2;

public class Variables {
    public static void main(String[] args) {

        System.out.println(" Задача №1 ");
        //Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их).

        // Тип переменных целочисленные


        byte min_byte = Byte.MIN_VALUE;
        byte max_byte = Byte.MAX_VALUE;
        System.out.println("от " + min_byte + " до " + max_byte);

        short min_short = Short.MIN_VALUE;
        short max_short = Short.MAX_VALUE;
        System.out.println("от " + min_short + " до " + max_short);

        int min_int = Integer.MIN_VALUE;
        int max_int = Integer.MAX_VALUE;
        System.out.println("от " + min_int + " до " + max_int);

        long min_long = Long.MIN_VALUE;
        long max_long = Long.MAX_VALUE;
        System.out.println("от " + min_long + " до " + max_long + " после присваивания в конце ставят L");

        //Тип переменных с плавающей точкой

        float min_float = Float.MIN_VALUE;
        float max_float = Float.MAX_VALUE;
        System.out.println("от " + min_float + " до " + max_float + " после присваивания в конце ставят f");

        double min_double = Double.MIN_VALUE;
        double max_double = Double.MAX_VALUE;
        System.out.println("от " + min_double + " до " + max_double);

        //Символьный тип от 0 до 65536 2 байта.
        char symbol = 'K';
        symbol++;
        System.out.println(symbol);

        // Логический тип true or false, 1bit.

        boolean b1 = 0 > 1;
        System.out.println(b1);
        boolean b2 = 0 < 1;
        System.out.println(b2);

        System.out.println(" Задача №2 ");
        /*А теперь решите задание.
          В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться,
          что боксеры соответствуют своей весовой категории, и бой будет честным.
          Вес одного боксера – 78,2 кг
          Вес второго боксера – 82,7 кг
          Подсчитайте и выведите в консоль общий вес двух бойцов.
          Подсчитайте и выведите в консоль разницу между весами бойцов.

         */
        double weightBoxerOne = 78.2;
        double weightBoxerTwo = 82.7;
        double totalWeight = weightBoxerOne + weightBoxerTwo;
        System.out.println("Общий вес боксеров: " + totalWeight + " кг");
        double differenceBetweenWeights = weightBoxerTwo - weightBoxerOne;
        System.out.println("Разница между весами бойцов: " + differenceBetweenWeights + " кг");

        System.out.println(" Задача №3 ");
        /*
           – Бананы – 5 штук (1 банан - 80 грамм);
           – Молоко – 200 мл (100 мл = 105 грамм);
           – Мороженое пломбир – 2 брикета по 100 грамм;
           – Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
             Смешать всё в блендере и готово.
             Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
             Результат напечатайте в консоль.
         */
        int banana = 5 * 80;
        int milk = (int) (1.050 * 100) * 2;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        double totalWeightBreakfast = ((banana + milk + iceCream + eggs) * 0.001);
        System.out.println("Общий вес завтрака спортсмена составил: " + totalWeightBreakfast + " кг.");

        System.out.println(" Задача №4 ");
        /*
        Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты подсчетов выведите в консоль.
         */
        int weight = 7 * 1000;
        int loseWeightOne = 250;
        int loseWeightTwo = 500;
        int daysForFirst = weight / loseWeightOne;
        int daysForSecond = weight / loseWeightTwo;
        int daysAverage = (daysForFirst + daysForSecond) / 2;
        System.out.println("Для потери веса понадобится дней: " + daysForFirst);
        System.out.println("Для потери веса понадобится дней: " + daysForSecond);
        System.out.println("Среднее колличество дней: " + daysAverage);


        System.out.println(" Задача №5 ");
        /*
        Маша получает 67 760 рублей в месяц
        Денис получает 83 690 рублей в месяц
        Кристина получает 76 230 рублей в месяц
        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        Выведите в консоль информацию по каждому сотруднику.
        Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
         */
        int firstEmployeeSalary = 67760;
        int firstFormulaPercentage = firstEmployeeSalary + (firstEmployeeSalary * 10) / 100;
        int firstTotalSalaryYear = firstEmployeeSalary * 12;
        int firstTotalNewSalary = firstFormulaPercentage * 12;
        int firstAnnualIncomeGrown = firstTotalNewSalary - firstTotalSalaryYear;
        System.out.println("Маша теперь получает " + firstFormulaPercentage + "рублей. Годовой доход вырос на " + firstAnnualIncomeGrown + "рублей.");

        int secondEmployeeSalary = 83690;
        int secondFormulaPercentage = secondEmployeeSalary + (secondEmployeeSalary * 10) / 100;
        int secondTotalSalaryYear = secondEmployeeSalary * 12;
        int secondTotalNewSalary = secondFormulaPercentage * 12;
        int secondAnnualIncomeGrown = secondTotalNewSalary - secondTotalSalaryYear;
        System.out.println("Денис теперь получает " + secondFormulaPercentage + "рублей. Годовой доход вырос на " + secondAnnualIncomeGrown + "рублей.");

        int thirdEmployeeSalary = 76230;
        int thirdFormulaPercentage = thirdEmployeeSalary + (thirdEmployeeSalary * 10) / 100;
        int thirdTotalSalaryYear = thirdEmployeeSalary * 12;
        int thirdTotalNewSalary = thirdFormulaPercentage * 12;
        int thirdAnnualIncomeGrown = thirdTotalNewSalary - thirdTotalSalaryYear;
        System.out.println("Кристина теперь получает " + thirdFormulaPercentage + "рублей. Годовой доход вырос на " + thirdAnnualIncomeGrown + "рублей.");

        System.out.println(" Задача №6 ");
        /*
        Объявите целочисленные переменные *a* = 12, *b* = 27, *c* = 44, *d* = 15, *e* = 9.
        Вычислите выражение a * (b + (c - d * e)) и присвойте его результат переменной *result*.
        Инвертируйте результат (значение в переменной *result*),
        преобразовав его в вариант с противоположным значением (отрицательное -> положительное, положительное -> отрицательное).
        Выведите (напечатайте) результат в консоль.
         */
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result);
        result = -result;
        System.out.println(result);

        System.out.println(" Задача №7 ");
        /*Объявите целочисленные переменные *a* = 5 и *b* = 7.
         С помощью математических манипуляций добейтесь того, чтобы *a* = 7 и *b* = 5.
         Использовать дополнительные переменные или числа запрещено.

         */
        int box_a = 5;
        int box_b = 7;
        System.out.println(box_a + " " + box_b);
        box_b = box_a + box_b; // 5 + 7
        box_a = box_b - box_a; // 12 - 5
        box_b = box_b - box_a; // 12 - 7
        System.out.println(box_a + " " + box_b);

        System.out.println(" Задача №8 ");
        /*
        Объявите переменную *a* и инициализируйте ее любым трехзначным числом.
        Объявите переменную *b* и, путем математических операций над *a* получите и присвойте переменной *b* цифру,
        которая находится в центре значения из переменной *a*.
        Например, если *a* = 2**5**6, то необходимо с помощью математических действий
        достать цифру 5 из центра и присвоить переменной *b*. Если *a* = 7**8**9, то b должна быть инициализирована числом 8,
        так как эта цифра является вторым из трех (центральным) символом в значении *a*.
        Следует учесть, что алгоритм должен быть универсальным и корректно срабатывать на любых трехзначных числах из *a* без изменений.
        Это значит, что рассчитать в голове сумму, которую необходимо вычесть или прибавить к *a* для корректного значения в *b* нельзя,
        так как при каждом изменении значения в *a* её нужно пересчитывать.
         */
        int n = 396;
        System.out.print((n % 100 - n % 10) / 10);

    }
}
