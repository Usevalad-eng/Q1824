package homeTasks.homeTask5EmplyeeV2;

public class SeniorDev extends Employee{
    public SeniorDev(String name, String sname, int experience) {
        super(name, sname, experience);
        setPosition();
    }

    @Override
    public void setPosition() {
        this.position=Position.SENIOR_DEVELOPER;
    }
}