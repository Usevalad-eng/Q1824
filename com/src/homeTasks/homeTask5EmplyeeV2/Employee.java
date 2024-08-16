package homeTasks.homeTask5EmplyeeV2;

import java.util.Arrays;

public abstract class Employee extends Person{
    protected Position position;
    protected int experience;
    protected static final double BASE_SALARY = 1000;
    protected String[] skills = new String[5];
    protected int skillsCount=0;

    public Employee(String name, String sname, int experience) {
        super(name, sname);
        this.experience = experience;
    }
    public abstract void setPosition();
    public void addSkills(String skill){
        if (skillsCount<skills.length){
            skills[skillsCount++]=skill;
        }
    }
    public String[] getSkill(){
        return Arrays.copyOf(skills,skillsCount);
    }
    public double calculateSalary(){
        double skillBonus=0;
        switch (position){
            case JUNIOR_DEVELOPER:
                skillBonus=0.05;
                break;
            case QA_ENGINEER:
                skillBonus=0.06;
            case SENIOR_DEVELOPER:
                skillBonus=1.05;
                break;
            case TEAM_LEAD:
                skillBonus=1.06;
                break;

        }
        return BASE_SALARY* position.getCoef()*(1+skillsCount*skillBonus)*experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position=" + position +
                ", experience=" + experience +
                ", skills=" + Arrays.toString(skills) +
                ", skillsCount=" + skillsCount +
                ", name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
