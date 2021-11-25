package sky.pro_lesson_2_2;

public class Car extends Vehicle implements ServiceStation {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("У автомобиля " + getModelName() + " меняем покрышки " + getWheelsCount() + " шт.");
    }

    public void checkEngine() {
        System.out.println("У автомобиля " + getModelName() + " проверяем двигатель");
    }

    @Override
    public void checkTrailer() {

    }
}
