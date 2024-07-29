package homeTasks.homeTask4;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String  name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPerson(){
        System.out.println("Name and Surname: "+ getName() +"  "+ getSurname());
        return getName();
    }
    public String get2Person(){
        //System.out.printf("Name: %s, Surname: %S", name,surname);
        return getSurname();
    }
}
