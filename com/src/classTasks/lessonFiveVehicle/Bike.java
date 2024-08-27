package classTasks.lessonFiveVehicle;

public class Bike extends AbstractVehicle{

    public Bike() {
        super("Bike");
    }

    @Override
    public int getMaxSpeed() {
        return 30;
    }

    @Override
    public void start() {
        System.out.println(" bike starts ");
    }

    @Override
    public void accelerate(int speed) {
        this.currentSpeed=Math.min(speed,getMaxSpeed());
        System.out.println("Bike is acceleratingtill till " + this.currentSpeed + " km/h " );
    }
}
