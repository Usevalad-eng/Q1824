package homeTasks.homeTask5;

import java.util.Arrays;

public class Project {
    public String projectName;
    public Person[] staff = new Person[10];
    public  int curentStaff;

    public Project(String projectName, int curentStaff, Person[] s) {
        this.projectName = projectName;
        this.curentStaff = curentStaff;
        this.staff = s;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", staff=" + Arrays.toString(staff) +
                ", curentStaff=" + curentStaff +
                '}';
    }
}
