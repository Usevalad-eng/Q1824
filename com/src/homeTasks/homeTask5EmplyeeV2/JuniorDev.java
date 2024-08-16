package homeTasks.homeTask5EmplyeeV2;

public class JuniorDev extends Employee{

    public JuniorDev(String name, String sname, int experience) {
        super(name, sname, experience);
        setPosition();
    }

    @Override
    public void setPosition() {
        this.position=Position.JUNIOR_DEVELOPER;
    }
}
