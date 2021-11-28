package sky.pro_lesson_2_2;

public class Vehicle implements Transport {
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public void check() {
        System.out.println("Обслуживание: " + getModelName());
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
