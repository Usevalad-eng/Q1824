package homeTasks.homeTask4;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{

    public Director(int ageExperience, PROF position, double coef) {
        super(ageExperience, position, coef);
    }
    public List<Employee> workers = new ArrayList<>();
    public void addWorker(Employee worker){
        workers.add(worker);
    }
    @Override
    public PROF getProf() {
        return PROF.DIRECTOR;
    }

    @Override
    public String setPosition(PROF position) {
        this.position=position;
        return null;
    }

    @Override
    public int printSalary() {

        return super.printSalary()+(int) (workers.size()*1.2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
