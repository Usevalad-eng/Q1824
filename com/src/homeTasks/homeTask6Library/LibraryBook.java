package homeTasks.homeTask6Library;

public class LibraryBook extends LibraryProduct{
    protected String author;

    public LibraryBook(String name, int quantity, String author) {
        super(name, quantity);
        this.author=author;
    }

    @Override
    public void display() {
        System.out.printf("Name of the book: %s Quantity: %d Author: %s \t", name, libraryQuantity, author);
    }

    @Override
    public void displayGetBack() {       //new
        System.out.printf("Name of the book: %s  Author: %s \t", name, author);
    }
}
