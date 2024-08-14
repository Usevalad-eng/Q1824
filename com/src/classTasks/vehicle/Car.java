package classTasks.vehicle;

public class Car extends AbstractVehicle{

    public Car() {
        super("automobile");
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public void start() {
        System.out.println("Automobile is starting");
    }

    @Override
    public void accelerate(int speed) {
        this.currentSpeed=Math.min(speed,getMaxSpeed());
        System.out.println("Automobile is accelerating till "+ this.currentSpeed + " km/h ");
    }
}
