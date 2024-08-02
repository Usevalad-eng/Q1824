package homeTasks.homeTask5;

public class Juniordev extends Employee{
    public Juniordev(String name, String sname, int age) {
        super(name, sname, age);
    }

    @Override
    public void setProf() {
        this.prof= PROFESSION.JUNIOR_DEVELOPER;
    }

    @Override
    public int getSalary() {
        return basic * prof.getCoef()*age + (int) (1+skills.length*0.05);
    }
}
