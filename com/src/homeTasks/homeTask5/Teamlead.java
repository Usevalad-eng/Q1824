package homeTasks.homeTask5;

public class Teamlead extends Employee{

    public Teamlead(String name, String sname, int age) {
        super(name, sname, age);
    }

    @Override
    public void setProf() {
        this.prof= PROFESSION.TEAM_LEAD;
    }

    @Override
    public int getSalary() {
        return basic * prof.getCoef()*age + (int) (1+skills.length*0.1);
    }
}
