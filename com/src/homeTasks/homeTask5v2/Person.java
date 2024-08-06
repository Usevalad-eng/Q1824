package homeTasks.homeTask5v2;

public class Person {
    protected String name;
    protected String sname;

    public Person(String name, String sname) {
        this.name = name;
        this.sname = sname;
    }
    public String getFullName(){
        return name + sname;
    }
}
