package homeTasks.homeTask6Library;

public abstract class LibraryProduct{
    protected String name;
    protected int libraryQuantity;

    public LibraryProduct(String name, int Libquantity) {
        this.name = name;
        this.libraryQuantity = Libquantity;
    }
    public abstract void display();

    public abstract void displayGetBack(); //new
    public boolean isAvailable(){
        return libraryQuantity > 0;
    }
    public void decreaseLibraryStock(int quantity){
        if (quantity < libraryQuantity){
            libraryQuantity = libraryQuantity- quantity;
        }else {
            System.out.println("There is no books/magazines in library");
        }
    }
    public void increaseLibraryStock(int quantity){  //new
        if (quantity > 0){
            libraryQuantity += quantity;
        }else {
            System.out.println("Can not increase library stock");
        }
    }
}
