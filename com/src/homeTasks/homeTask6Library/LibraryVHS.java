package homeTasks.homeTask6Library;

public class LibraryVHS extends LibraryProduct implements Length{ //new
    int length;

    public LibraryVHS(String name, int Libquantity, int length) {
        super(name, Libquantity);
        this.length=length;
    }

    @Override
    public void display() {
        System.out.printf("Name of the VHS: %s Quantity: %d \t", name, libraryQuantity);
    }

    @Override
    public void displayGetBack() {
        System.out.printf("Name of the VHS: %s \t", name);
    }

    @Override
    public void getLength() {
        System.out.println("Length of VHS: " + "\""+ this.name + "\"" +"   " + length + " min ");
    }
}
