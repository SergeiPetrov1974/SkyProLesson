package sky.pro_lesson_2_2;

public class VehicleWithEngine extends Vehicle {
    public VehicleWithEngine(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем движок");
    }
}
