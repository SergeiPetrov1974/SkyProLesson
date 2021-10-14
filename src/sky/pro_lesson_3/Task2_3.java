package sky.pro_lesson_3;
/*
Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий
— операционной системы телефона (iOS или Android) и года производства.
Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
Например, для iOS оно будет звучать так:
«Установите облегченную версию приложения для iOS по ссылке».
А для Android так:
«Установите облегченную версию приложения для Android по ссылке».
При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
 */

public class Task2_3 {
    private int enterClientNumber = 0;
    private int enterClientYear = 0;
    private int clientDeviceYear = 2015;

    public Task2_3(int enterClientNumber, int enterClientYear) {
        this.enterClientNumber = enterClientNumber;
        this.enterClientYear = enterClientYear;
    }

    public void start() {
        clientSoftware();

    }

    public void clientSoftware() {
        if (enterClientNumber == 0 && enterClientYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (enterClientNumber == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (enterClientNumber == 1 && enterClientYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (enterClientNumber == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого приложения нет. Обратитесь к продавцу.");
        }
    }
}

