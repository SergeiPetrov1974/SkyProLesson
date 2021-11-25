package sky.pro_lesson_2_2;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Школьник", 2);
        bicycle.updateTyre();
        System.out.println("*******************************************");

        Car car = new Car("Лада", 4);
        Car car2 = new Car("УАЗ", 4);
        car.updateTyre();
        car.checkEngine();
        car2.updateTyre();
        car2.checkEngine();
        System.out.println("*******************************************");

        Truck truck = new Truck("Зил", 6);
        truck.updateTyre();
        truck.checkEngine();
        System.out.println("*******************************************");

        Truck truck2 = new Truck("Камаз", 10);
        truck2.checkTrailer();
        truck2.updateTyre();


    }
}
