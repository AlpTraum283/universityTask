package task1;

import java.util.Objects;

/**
 * Модель данных автомобиля.
 */
public class Vehicle {

    /**
     * Модель машины.
     */
    private String model;

    /**
     * Регистрационный номер.
     */
    private Long regNumber;

    /**
     * Год выпуска.
     */
    private Long yearOfManufacture;

    /**
     * Пробег.
     */
    private Long mileage;

    /**
     * Стоимость.
     */
    private Long cost;

    public Vehicle() {
    }

    public Vehicle(String model, Long regNumber, Long yearOfManufacture, Long mileage, Long cost) {
        this.model = model;
        this.regNumber = regNumber;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = mileage;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(Long regNumber) {
        this.regNumber = regNumber;
    }

    public Long getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Long yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(model, vehicle.model) &&
                Objects.equals(regNumber, vehicle.regNumber) &&
                Objects.equals(yearOfManufacture, vehicle.yearOfManufacture) &&
                Objects.equals(mileage, vehicle.mileage) &&
                Objects.equals(cost, vehicle.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, regNumber, yearOfManufacture, mileage, cost);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", regNumber=" + regNumber +
                ", yearOfManufacture=" + yearOfManufacture +
                ", mileage=" + mileage +
                ", cost=" + cost +
                '}';
    }
}
