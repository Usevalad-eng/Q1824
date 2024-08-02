package homeTasks.homeTask5;

import homeTasks.homeTask4UsingArrays.Employe;
import homeTasks.homeTask4UsingArrays.PROFF;

import java.util.Arrays;

public abstract class Employee extends Person{
    protected int age;
    protected final int basic = 1000;
    protected PROFESSION prof;
    protected String skill;
    protected String[] skills = new String[4];
    public Employee(String name, String sname, int age) {
        super(name, sname);
        this.age=age;
        setProf();
    }
    public void addSkill(String skill){
        if (skills==null){
            skills=new String[1];
            skills[0]=skill;
        }else {
            skills= Arrays.copyOf(skills,skills.length+1);
            skills[skills.length-1]=skill;
        }
    }

    public String getSkills() {
        return skill;
    }

    public int getSalary(){
        return basic * prof.getCoef()*age;
    }
    public abstract void setProf();
    public void getPromoted(){
        if (prof.equals(PROFESSION.WORKER)){
            this.prof= PROFESSION.QA_ENGINEER;
        } else if (prof.equals(PROFESSION.QA_ENGINEER)) {
            this.prof= PROFESSION.JUNIOR_DEVELOPER;
        } else if (prof.equals(PROFESSION.JUNIOR_DEVELOPER)){
            this.prof= PROFESSION.SENIOR_DEVELOPER;
        } else if (prof.equals(PROFESSION.SENIOR_DEVELOPER)) {
            this.prof= PROFESSION.TEAM_LEAD;
        } else if (prof.equals(PROFESSION.TEAM_LEAD)) {
            this.prof= PROFESSION.DIRECTOR;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", prof=" + prof +
                ", skill='" + skill + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
