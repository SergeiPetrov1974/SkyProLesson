package sky.pro_lesson_2_2;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[]{
                new Bicycle("Школьник", 3),
                new Bicycle("Орленок"),
                new Car("Лада", 4),
                new Car("Москвич", 4),
                new Truck("Зил", 6),
                new Truck("Камаз", 8),

        };
        ServiceStation station = new ServiceStation();

        for (Transport transport : transports) {
            station.check(transport);

        }
    }
}
