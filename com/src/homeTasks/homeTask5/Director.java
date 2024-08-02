package homeTasks.homeTask5;

import homeTasks.homeTask4UsingArrays.Employe;
import homeTasks.homeTask4UsingArrays.PROFF;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Director extends Employee{
    protected Employee[] employees;
    protected Employee[] employeesProject;
    protected Project[] proj;

    public Director(String name, String sname, int age) {
        super(name, sname, age);
    }

    public void addWorker(Employee empl){
        if (employees==null){
            employees=new Employee[1];
            employees[0]=empl;
        }else {
            employees= Arrays.copyOf(employees,employees.length+1);
            employees[employees.length-1]=empl;
        }
    }
    public void assignToProject(Employee emplo, Project p){
        if (employeesProject==null){

            employeesProject=new Employee[1];
            employeesProject[0]=emplo;
            proj=new Project[1];
            proj[0]=p;
        }else {
            employeesProject= Arrays.copyOf(employeesProject,employeesProject.length+1);
            employeesProject[employeesProject.length-1]=emplo;
            proj= Arrays.copyOf(proj,proj.length+1);
            proj[proj.length-1]=p;
        }
    }

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

    public int getAllSalary(int quontity){
        return (basic * prof.getCoef() * age) * quontity;

    }
    @Override
    public void setProf() {
        this.prof= PROFESSION.DIRECTOR;
    }

    @Override
    public int getSalary() {
        if (employees==null) {
            return super.getSalary();
        }else {
            return super.getSalary() + 50 * (employees.length) + (proj.length * 1000);
        }
    }


}
