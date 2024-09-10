package homeTasks.homeTask12Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FleetManager {
    private List<Vehicle> vehicles;
    private List<Driver> drivers;
    private List<Trip> trips;

    public FleetManager() {
        this.vehicles = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.trips = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public void planTrip(Trip trip) throws DriverNotFoundException,VehicleNotFoundException{
        if (!vehicles.contains(trip.getVehicle())){
            throw new VehicleNotFoundException("Vehicle not found");
        }
        if (!drivers.contains(trip.getDriver())){
            throw new DriverNotFoundException("Driver not found");
        }
        trips.add(trip);
        trip.getVehicle().drive(trip.getDistance());
    }

    public List<Vehicle> getAvailableVehicle(){
        return vehicles.stream()
                .filter(vehicle -> trips.stream().noneMatch(trip -> trip.getVehicle().equals(vehicle)))
                .collect(Collectors.toList());
    }

    public List<Driver> getAvailableDriver(){
        return drivers.stream()
                .filter(driver -> trips.stream().noneMatch(trip -> trip.getDriver().equals(driver)))
                .collect(Collectors.toList());
    }

    public void getHistory(Vehicle vehicle) throws VehicleNotFoundException {
        //List<Trip> tripHistory = new ArrayList<>();
        for (Trip t : trips){
            if (t.getVehicle().getId() == vehicle.getId()){
                System.out.println("Vehicle id: " + t.getVehicle().getId() +
                        " Trip id: " + t.getId() + "  Start date:  " + t.getStartDate() +
                        " End date: " + t.getEndDate());
            } else {
                throw new VehicleNotFoundException("Vehicle not found");
            }
        }
    }

}
