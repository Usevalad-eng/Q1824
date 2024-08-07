package classTasks.lessonFourShop;

public class Customer {
    protected String name;
    protected String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void displayInfo(){
        System.out.printf("Name : %S  email :  %S", name, email);
    }
}
