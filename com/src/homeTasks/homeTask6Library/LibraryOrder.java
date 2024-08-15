package homeTasks.homeTask6Library;

public class LibraryOrder {
    protected LibraryCustomer customer;
    protected LibraryProduct product;
    protected int quantity;

    public LibraryOrder(LibraryCustomer customer, LibraryProduct product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
    public void processOrder(){
        if (product.isAvailable()&&product.libraryQuantity>=quantity){
            product.decreaseLibraryStock(quantity);
            System.out.println("Library order is processed");
            customer.display();
            System.out.println("\t");
            product.display();
            System.out.println("Quontity: " + quantity);
            System.out.println("\t");
        }else {
            System.out.println("Can not process the library good, no such library good on the library");
        }
    }

    public void processOrderGetBack(){    //new
        if (quantity>0){
            product.increaseLibraryStock(quantity);
            System.out.println("Library order is processed, Library product was returned");
            customer.display();
            System.out.println("\t");
            product.displayGetBack();
            //System.out.println("Quantity: " + quantity);
            System.out.println("\t");
        }else {
            System.out.println("Can not process the library good");
        }
    }
}
