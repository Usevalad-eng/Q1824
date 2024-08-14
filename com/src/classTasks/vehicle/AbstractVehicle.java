package classTasks.vehicle;

public abstract class AbstractVehicle implements Vehicle{
    String type;
    int currentSpeed =0;

    public AbstractVehicle(String type) {
        this.type = type;
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping");
    }

    @Override
    public String getType() {
        return type;
    }
    public abstract int getMaxSpeed();

    public void printStatus(){
        System.out.println(type + " goes with a speed " + currentSpeed + " km/h ");
    }
    public  void useVehicle(Vehicle vehicle){
        System.out.println("Is used " + vehicle.getType());
        vehicle.start();
        vehicle.accelerate(20);
        if (vehicle instanceof AbstractVehicle){
            AbstractVehicle abstractVehicle = (AbstractVehicle) vehicle;
            System.out.println(" Max speed " + abstractVehicle.getMaxSpeed() + " km/h ");
            abstractVehicle.printStatus();
        }
        vehicle.stop();
    }
}
