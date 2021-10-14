package sky.pro_lesson_3;
/*
Напишите программу, которая определяет, чем пользуется клиент (iOS или Android),
и выдает соответствующее сообщение для обоих вариантов.
Объявите переменную clientOS, которая равна 0 или 1.
0 — iOS, 1 — Android.
При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
Например, для iOS оно будет звучать так:
«Установите версию приложения для iOS по ссылке».
А для Android так:
«Установите версию приложения для Android по ссылке».
 */

public class Task1_3 {
    private int enterClientNumber = 0;

    public Task1_3(int enterClientNumber) {
        this.enterClientNumber = enterClientNumber;
    }

    public void start() {
        clientSoftware();
    }

    public void clientSoftware() {
        if (enterClientNumber == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (enterClientNumber == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Такого приложения нет. Обратитесь к продавцу.");
        }
    }
}
