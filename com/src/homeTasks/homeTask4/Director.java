package homeTasks.homeTask4;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{

    public Director(int ageExperience, PROF position) {
        super(ageExperience, position);
    }
    public List<Employee> workers = new ArrayList<>();
    public void addWorker(Employee worker){
        workers.add(worker);
    }
    public List<Employee> workers2 = new ArrayList<>();
    public void addWorkerForSecondDir(Employee worker){
        workers2.add(worker);
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

        return super.printSalary()*(int) (workers.size()*1.1);
    }
    public int printSalarySecDir() {

        return super.printSalary()*(int) (workers2.size()*1.1);
    }

}
