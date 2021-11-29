package sky.pro_lesson_2_2;

public class Truck extends VehicleWithEngine {
    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();

    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
