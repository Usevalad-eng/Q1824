package homeTasks.homeTask6;

public class OnlineSLibrary {
    private LibraryProduct[] products;
    private int productCount;

    public OnlineSLibrary(int maxProduct) {
        products = new LibraryProduct[maxProduct];
        productCount = 0;
    }
    public void addProduct(LibraryProduct product){
        if (productCount<products.length){
            products[productCount]=product;
            productCount++;
            System.out.println("Library product is added");
        }else {
            System.out.println("Can't add library product");
        }
    }
    public void displayAllLibraryProducts(){
        System.out.println("Goods(books/magazines) are in the Library:  \t");
        for (int i=0;i<productCount;i++){
            products[i].display();
            System.out.println("\t");
        }
    }
}
