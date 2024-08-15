package homeTasks.homeTask6Library;

public class LibraryMagazine extends LibraryProduct{

    protected String number;

    public LibraryMagazine(String name, int quantity, String magazineNumber) {
        super(name, quantity);
        this.number=magazineNumber;
    }

    @Override
    public void display() {
        System.out.printf("Name of the magazine: %S Quantity:%d   N:%s \t", name, libraryQuantity, number);
    }

    @Override
    public void displayGetBack() {   //new
        System.out.printf("Name of the magazine: %S    N:%s \t", name, number);
    }
}
