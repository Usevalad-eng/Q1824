package homeTasks.homeTask3;

public enum USERENAME {
    JOHN("John","Smith",35,"man"),
    IVAN("Ivan","Ivanov",50,"man");


    private String name;
    private String surname;
    private int age;
    private String sex;

    USERENAME(String name, String surname, int age, String sex) {
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

    public void getNameSurname(){
        System.out.println("Name and surname: "+getName()+"  "+getSurname());
    }
    public void getUser(){
        System.out.println("Name and surname: "+getName()+"  "+getSurname()+"sex: "+getSex()+"age: "+getAge());
    }


}
