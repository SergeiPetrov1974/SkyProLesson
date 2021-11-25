package sky.pro_lesson_2_2;

public class Truck extends Vehicle implements ServiceStation {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("У автомобиля " + getModelName() + " меняем покрышки " + getWheelsCount() + " шт.");
    }

    public void checkEngine() {
        System.out.println("У автомобиля " + getModelName() + " проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("У автомобиля " + getModelName() + " проверяем прицеп");
    }
}
