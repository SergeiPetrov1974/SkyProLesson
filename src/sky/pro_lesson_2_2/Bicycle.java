package sky.pro_lesson_2_2;

public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Bicycle(String modelName) {
        super(modelName, 2);
    }

}
