package homeTasks.homeTask5EmplyeeV2;

public class QaEngineer extends Employee{

    public QaEngineer(String name, String sname, int experience) {
        super(name, sname, experience);
        setPosition();
    }

    @Override
    public void setPosition() {
        this.position=Position.QA_ENGINEER;
    }
}
