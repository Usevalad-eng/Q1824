package homeTasks.homeTask4UsingArrays;

public abstract class Employe extends Persona{
    protected int age;
    protected final int basic = 1000;
    protected PROFF prof;
    public Employe(String name, String sname, int age) {
        super(name, sname);
        this.age=age;
        setProf();
    }
    public int getSalary(){
        return basic*prof.getCoef()*age;
    }
    public abstract void setProf();

    @Override
    public String toString() {
        return "Employe{" +
                "age=" + age +
                ", prof=" + prof +
                ", name=" + name +
                ", sname=" + sname +
                '}';
    }

}
