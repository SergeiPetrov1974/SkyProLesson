package sky.pro_lesson_2;

public class Task4 {
    private int weight;
    private int loseWeightOne;
    private int loseWeightTwo;


    public Task4(int weight, int loseWeightOne, int loseWeightTwo) {
        this.weight = weight;
        this.loseWeightOne = loseWeightOne;
        this.loseWeightTwo = loseWeightTwo;
    }

    public void start() {
        show();
    }

    private int dayForFirst() {
        return (weight * 1000) / loseWeightOne;
    }

    private int dayForSecond() {
        return (weight * 1000) / loseWeightTwo;
    }

    private int dayAverage() {
        return (dayForFirst() + dayForSecond()) / 2;
    }

    private void show() {
        System.out.println("Для потери веса понадобится дней: " + dayForFirst());
        System.out.println("Для потери веса понадобится дней: " + dayForSecond());
        System.out.println("Среднее колличество дней: " + dayAverage());
    }
}
