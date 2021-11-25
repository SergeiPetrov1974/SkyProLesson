package sky.pro_lesson_2_2;

public class Bicycle extends Vehicle implements ServiceStation {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("У велосипеда " + getModelName() + " меняем покрышки " + getWheelsCount() + " шт.");
    }

    @Override
    public void checkEngine() {

    }

    @Override
    public void checkTrailer() {

    }
}
