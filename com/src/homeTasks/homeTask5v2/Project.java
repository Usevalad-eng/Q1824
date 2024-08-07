package homeTasks.homeTask5v2;

import java.util.Arrays;

public class Project {
    protected String name;
    protected Employee[] employees;
    protected int employeeCount=0;

    public Project(String name) {
        this.name = name;
        this.employees=new Employee[10];
    }
    public void addEmployee(Employee employee){
        if (employeeCount<employees.length){
            employees[employeeCount]=employee;
        }
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Project").append(name).append("\nEmployees\n");
//        for (int i=0;i<employeeCount;i++){
//            sb.append(" ")
//                    .append(employees[i].getFullName())
//                    .append(employees[i].position)
//                    .append(employees[i].calculateSalary())
//                    .append("\n");
//        }
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
