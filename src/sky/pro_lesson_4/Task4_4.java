package sky.pro_lesson_4;
/*
Это задание очень любят давать на собеседованиях в разных вариациях, потому мы предлагаем его вам,
чтобы вы оценили свои силы.
Необходимо пройти циклом по числам от 1 до 30 включительно и,
если число делится на 3 без остатка, вывести ping, а если число делится на 5 без остатка, вывести pong.
Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
Допускается наличие пустых строк в выводе.
- Вывод должен быть следующий:
    1:
    2:
    3: ping
    4:
    5: pong
    6: ping
    7:
    8:
    9: ping
    10: pong

    11:

    12: ping

    13:

    14:

    15: ping pong

    16:

    17:

    18: ping

    19:

    20: pong
 */

public class Task4_4 {
    int divisionOne;
    int divisionTwo;
    private int number;

    public Task4_4(int number, int divisionOne, int divisionTwo) {
        this.number = number;
        this.divisionOne = divisionOne;
        this.divisionTwo = divisionTwo;
    }

    public void start() {
        divisionWithoutRemainder();
    }

    private void divisionWithoutRemainder() {
        for (int i = 1; i < number; i++) {
            if (i % divisionOne == 0) {
                System.out.println(i + ": ping");
            } else if (i % divisionTwo == 0) {
                System.out.println(i + ": pong");
            }
            if (i % divisionOne == 0 && i % divisionTwo == 0) {
                System.out.println(i + ": ping pong");
            }
            System.out.println(i + ": ");
        }
    }
}
