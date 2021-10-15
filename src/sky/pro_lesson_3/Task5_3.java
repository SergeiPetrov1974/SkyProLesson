package sky.pro_lesson_3;
/*
 Напишите программу, которая определяет по номеру месяца в году,
 к какому сезону этот месяц принадлежит. Например, 1 месяц (он же январь) принадлежит к сезону зима.
Для написания программы используйте оператор switch.
Для обозначения номера месяца используйте переменную monthNumber = 12.
Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
 */

public class Task5_3 {
    private int monthNumber;

    public Task5_3(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public void start() {
        belongSeason();

    }

    private void belongSeason() {
        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Такой сезон наверно есть на другой планете.";
                break;
        }
        System.out.println(monthNumber + " " + season);
    }
}
