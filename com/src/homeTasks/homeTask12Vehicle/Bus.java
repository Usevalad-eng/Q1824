package homeTasks.homeTask12Vehicle;

public class Bus extends Vehicle implements Drivable{
    private int passengerCapacity;

    public Bus(int id, String model, String brand, int year, int mileage, int passengerCapacity) {
        super(id, model, brand, year, mileage);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine  started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine  stopped");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Truck drove " + distance + " km");
        this.mileage += distance;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCapacity=" + passengerCapacity +
                ", id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }

}
