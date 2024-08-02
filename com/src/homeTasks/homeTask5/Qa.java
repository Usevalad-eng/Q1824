package homeTasks.homeTask5;

public class Qa extends Employee{

    public Qa(String name, String sname, int age) {
        super(name, sname, age);
    }

    @Override
    public void setProf() {
        this.prof= PROFESSION.QA_ENGINEER;
    }

    @Override
    public int getSalary() {
        return basic * prof.getCoef()*age + (int) (1+skills.length*0.07);
    }
}
