package homeTasks.homeTask5;

public class Person {
    protected String name;
    protected String sname;

    public Person(String name, String sname) {
        this.name = name;
        this.sname = sname;
    }
    public void printFullName(){
        System.out.println(name+"  "+sname);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name=" + name +
                ", sname=" + sname +
                '}';
    }
}
