package homeTasks.homeTask6;

public class LibraryCustomer {
    protected String name;
    protected String email;

    public LibraryCustomer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void display(){
        System.out.printf("Name of the customer : %S  Email :  %S", name, email);
    }
}
