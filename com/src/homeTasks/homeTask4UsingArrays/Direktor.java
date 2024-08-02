package homeTasks.homeTask4UsingArrays;

import java.util.Arrays;

public class Direktor extends Employe{
    private Employe[] employees;
    public Direktor(String name, String sname, int age) {
        super(name, sname, age);
    }

    public void addWorker(Employe employe){
        if (employees==null){
            employees=new Employe[1];
            employees[0]=employe;
        }else {
            employees= Arrays.copyOf(employees,employees.length+1);
            employees[employees.length-1]=employe;
        }
    }
    @Override
    public void setProf() {
        this.prof=PROFF.DIRECTOR;
    }
    @Override
    public int getSalary() {
        if (employees==null) {
            return super.getSalary();
        }else {
            return super.getSalary()+50* (employees.length);
        }
    }
}
