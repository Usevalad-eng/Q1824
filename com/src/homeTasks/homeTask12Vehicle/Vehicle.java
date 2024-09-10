package homeTasks.homeTask12Vehicle;

import java.util.Objects;

public class Vehicle {
    protected int id;
    protected String model;
    protected String brand;
    protected int year;
    protected int mileage;

    public Vehicle(int id, String model, String brand, int year, int mileage) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public  void drive(int distance) {
        System.out.println("Vehicle drove " + distance + " km.");
        this.mileage += distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id && year == vehicle.year && mileage == vehicle.mileage && Objects.equals(model, vehicle.model) && Objects.equals(brand, vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, brand, year, mileage);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }

}
