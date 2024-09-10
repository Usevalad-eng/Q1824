package homeTasks.homeTask12Vehicle;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collector;

public class Trip {
    private int id;
    private Vehicle vehicle;
    private Driver driver;
    private LocalDate startDate;
    private LocalDate endDate;
    private int distance;

    public Trip(int id, Vehicle vehicle, Driver driver, LocalDate startDate, LocalDate endDate, int distance) {
        this.id = id;
        this.vehicle = vehicle;
        this.driver = driver;
        this.startDate = startDate;
        this.endDate = endDate;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Driver getDriver() {
        return driver;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", vehicle=" + vehicle +
                ", driver=" + driver +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", distance=" + distance +
                '}';
    }

}
