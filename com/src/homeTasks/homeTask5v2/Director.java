package homeTasks.homeTask5v2;

public class Director extends Employee{
    private Employee[] sabordinates;
    private int sabordinatesCount;
    private Project[] projects;
    private int projectsCount;

    public Director(String name, String sname, int experience) {
        super(name, sname, experience);
        setPosition();
    }
    public void addWorker(Employee employee){
        if (sabordinatesCount<sabordinates.length){
            sabordinates[sabordinatesCount++]=employee;
        }
    }
    public Project createProject(String name){
        if (projectsCount<projects.length){
            Project project=new Project(name);
            projects[projectsCount++]=project;
            return project;
        }else return null;
    }
    public void assignToProject(Employee employee,Project project){
        project.addEmployee(employee);
    }
    public void promote(Employee employee){
        switch (employee.position){
            case JUNIOR_DEVELOPER:
                employee.position=Position.SENIOR_DEVELOPER;
                break;
            case SENIOR_DEVELOPER:
                employee.position=Position.TEAM_LEAD;
                break;
            case QA_ENGINEER:
                employee.position=Position.DIRECTOR;
                break;
        }
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()*(1+0.1*sabordinatesCount)+projectsCount*1000;
    }

    public double calculateTotalSalary(){
        double total = calculateSalary();
        for (int i=0;i<sabordinatesCount;i++){
            total+=sabordinates[i].calculateSalary();
        }
        return total;
    }
    @Override
    public void setPosition() {
        this.position=Position.DIRECTOR;
    }
}
