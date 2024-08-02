package homeTasks.homeTask5;

public class Seniordev extends Employee{
    public Seniordev(String name, String sname, int age) {
        super(name, sname, age);
    }

    @Override
    public void setProf() {
        this.prof= PROFESSION.SENIOR_DEVELOPER;
    }

    @Override
    public int getSalary() {
        return basic * prof.getCoef()*age + (int) (1+skills.length*0.1);
    }
}
