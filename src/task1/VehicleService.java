package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Сервис для работы с автомобилями.
 */
public class VehicleService {

    /**
     * Получить список автомобилей.
     *
     * @return список автомобилей.
     */
    public static List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Bentley", 100L, 2_001L, 500L, 10_005L));
        vehicles.add(new Vehicle("Audi", 200L, 2_005L, 700L, 10_080L));
        vehicles.add(new Vehicle("Peugeot", 300L, 2_008L, 123_515L, 9L));
        vehicles.add(new Vehicle("Aston Martin", 400L, 2_009L, 623_625L, 100_100L));
        vehicles.add(new Vehicle("BMW", 500L, 2_010L, 625_241L, 512_155L));
        vehicles.add(new Vehicle("Porsche", 600L, 2_011L, 512_661L, 1_024L));
        vehicles.add(new Vehicle("Dodge", 700L, 2_012L, 777_123L, 512_351L));
        vehicles.add(new Vehicle("Tesla", 800L, 2_013L, 111_632L, 666_666L));
        return vehicles;
    }

    /**
     * Найти автомобиль с самой низкой ценой.
     *
     * @param vehicles список автомобилей.
     * @return автомобиль с самой низкой ценой.
     */
    public static Vehicle findVehicleWithLowerCost(List<Vehicle> vehicles) {

        vehicles.sort(Comparator.comparing(Vehicle::getCost));
        return vehicles.get(0);
    }

    /**
     * Отсортировать список автомобилей по году выпуска.
     *
     * @param vehicles список автомобилей.
     */
    public static void sortVehiclesByYearOfManufacture(List<Vehicle> vehicles) {
        vehicles.sort(Comparator.comparing(Vehicle::getYearOfManufacture));
    }

    /**
     * Найти и изменить цену автомобиля по регистрационному номеру.
     *
     * @param vehicles  список автомобилей.
     * @param regNumber регистрационный номер.
     * @return автомобиль.
     */
    public static Vehicle searchAndUpdateVehicleByRegNumber(List<Vehicle> vehicles, Long regNumber, Long cost) {
        Vehicle vehicle = vehicles.stream()
                .filter(v1 -> regNumber.equals(v1.getRegNumber()))
                .findFirst()
                .orElse(null);
        if (vehicle != null) {
            vehicle.setCost(cost);
        }
        return vehicle;
    }
}
