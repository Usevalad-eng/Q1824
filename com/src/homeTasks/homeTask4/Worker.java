package homeTasks.homeTask4;

public class Worker extends Employee{

    public Worker(int ageExperience, PROF position, double coef) {
        super(ageExperience, position, coef);
    }

    @Override
    public PROF getProf() {
        return PROF.WORKER;
    }



    @Override
    public String setPosition(PROF position) {
        this.position=position;
        return null;
    }


}
