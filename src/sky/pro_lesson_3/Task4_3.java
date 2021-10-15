package sky.pro_lesson_3;
/*
Правила доставки такие:
Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
Напишите программу, которая выдает сообщение в консоль:
"Потребуется дней: " + срок доставки
Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
 */

public class Task4_3 {
    private int deliveryDistance;
    private int countDay = 1;

    public Task4_3(int deliveryDistance) {
        this.deliveryDistance = deliveryDistance;
    }

    public void start() {
        deliveryRules();

    }

    private void deliveryRules() {

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + countDay);
        } else if (deliveryDistance <= 60) {
            countDay++;
            System.out.println("Потребуется дней: " + countDay);
        } else if (deliveryDistance <= 100) {
            countDay += 2;
            System.out.println("Потребуется дней: " + countDay);
        } else {
            System.out.println("Доставки в указаных пределах: " + deliveryDistance + " км. Нет.");
        }
    }

}
