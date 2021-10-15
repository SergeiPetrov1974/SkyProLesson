package sky.pro_lesson_2;

public class Task3 {
    private double banana;
    private double iceCream;
    private double egg;

    public Task3(double banana, int milk, double iceCream, double egg) {
        this.banana = banana;
        this.iceCream = iceCream;
        this.egg = egg;
    }

    public void start() {
        show();

    }

    private double weightBanana() {
        return banana * 80;
    }

    private int weightMilk() {
        double fluidDensity = 1.050;
        return (int) (fluidDensity * 100) * 2;
    }

    private double weightIceCream() {
        return iceCream * 100;
    }

    private double weightEgg() {
        return egg * 70;
    }

    private double totalWeightBreakfast() {
        return (weightBanana() + weightMilk() + weightIceCream() + weightEgg()) * 0.001;
    }

    private void show() {
        System.out.println("Общий вес завтрака спортсмена составил: " + totalWeightBreakfast() + " кг.");
    }
}
