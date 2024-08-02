package homeTasks.homeTask4UsingArrays;

public class Persona {
    protected String name;
    protected String sname;

    public Persona(String name, String sname) {
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
