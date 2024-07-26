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

    public User(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public User() {
        System.out.println("empty");
    }

    public User(String name, String surname, int age, String sex,String country, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        Account account = new Account(country, city);
        System.out.println("user  "+name+"  "+surname+"  "+age+" years old "+sex+" ");
        account.displayAccount();
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
    public class Account {
        private String country;
        private String city;

        public Account(String country, String city) {
            this.country = country;
            this.city = city;
        }
        public void displayAccount(){
            System.out.printf("Country: %s \t  City:  %S \t ",country,city);
        }
    }
}
