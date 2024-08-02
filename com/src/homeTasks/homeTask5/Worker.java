package homeTasks.homeTask5;

import homeTasks.homeTask4UsingArrays.PROFF;

public class Worker extends Employee{
    public Worker(String name, String sname, int age) {
        super(name, sname, age);
    }

    @Override
    public void setProf() {
        this.prof= PROFESSION.WORKER;
    }

    @Override
    public int getSalary() {
        return basic * prof.getCoef()*age + (int) (1+skills.length*0.05);
    }
}
