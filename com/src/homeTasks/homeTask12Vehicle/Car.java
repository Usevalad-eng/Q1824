package homeTasks.homeTask12Vehicle;

public class Car extends Vehicle implements Drivable{
    private int numberOfSeats;
    public Car(int id, String model, String brand, int year, int mileage, int numberOfSeats) {
        super(id, model, brand, year, mileage);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine  started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine  stopped");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Car drove " + distance + " km");
        this.mileage += distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
