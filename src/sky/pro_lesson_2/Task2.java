package sky.pro_lesson_2;

public class Task2 {
    private double weightBoxerOne;
    private double weightBoxerTwo;

    public Task2(double weightBoxerOne, double weightBoxerTwo) {
        this.weightBoxerOne = weightBoxerOne;
        this.weightBoxerTwo = weightBoxerTwo;
    }

    public void start() {
        show();

    }

    private double weightTotal() {
        double totalWeight;
        return totalWeight = weightBoxerOne + weightBoxerTwo;
    }

    private double differenceWeight() {
        double weightDifference;
        return weightDifference = weightBoxerTwo - weightBoxerOne;
    }

    private void show() {
        System.out.println("Общий вес боксеров: " + weightTotal() + " кг");
        System.out.println("Разница между весами бойцов: " + differenceWeight() + " кг");
    }
}
