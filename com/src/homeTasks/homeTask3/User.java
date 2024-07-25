package homeTasks.homeTask3;

public class User {
    private String name;
    private String surname;
    private int age;
    private String sex;


    public User(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;
        } else {
            System.out.println("Error, age must be > 0");
        }

    }

    public void setSex(String sex) {
        if (sex.equalsIgnoreCase("man") || sex.equalsIgnoreCase("woman")){
            this.sex = sex;
        } else {
            System.out.println("Error");
        }

    }
    public void getNameSurname(){
        System.out.println("Name and surname  "+ getName() +"   "+ getSurname());
    }
    public void getUser(){
        System.out.println("Name and surname  "
                + getName() +"   "+ getSurname() + " Age  " + getAge() + " Sex  " + getSex());
    }
}
