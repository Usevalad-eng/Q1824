package homeTasks.homeTask4;

public abstract class Employee {
    public int ageExperience;
    public   PROF position;
    public double coef = getProf().getCoef();

    public Employee(int ageExperience, PROF position, double coef) {
        this.ageExperience = ageExperience;
        this.position = position;
        this.coef = coef;
    }

    public abstract PROF getProf();
    public int printSalary(){
        return 1000* ageExperience * getProf().getCoef();
    }

    public abstract String setPosition(PROF position);

}
