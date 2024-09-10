package homeTasks.homeTask12Vehicle;

public class Truck extends Vehicle implements Drivable{
    private double loadCapacity;

    public Truck(int id, String model, String brand, int year, int mileage, double loadCapacity) {
        super(id, model, brand, year, mileage);
        this.loadCapacity = loadCapacity;
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
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
