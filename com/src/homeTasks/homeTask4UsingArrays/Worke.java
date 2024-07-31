package homeTasks.homeTask4UsingArrays;

public class Worke extends Employe{

    public Worke(String name, String sname, int age) {
        super(name, sname, age);
    }
    @Override
    public void setProf() {
        this.prof=PROFF.WORKER;
    }

}
