package homeTasks.homeTask12Vehicle;

public class Driver {
    private int id;
    private String firstName;
    private String lastname;
    private int age;
    private String licenseCategory;

    public Driver(int id, String firstName, String lastname, int age, String licenseCategory) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.licenseCategory = licenseCategory;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", licenseCategory='" + licenseCategory + '\'' +
                '}';
    }

}
