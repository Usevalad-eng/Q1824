package homeTasks.homeTask6LibraryV2;

public class Book extends LibraryItem{
    protected String author;
    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void borrow() {
        if (available){
            available = false;
            System.out.println(" Book " + title + " is issued ");
        } else {
            System.out.println(" Book " + title + " is not available ");
        }
    }

    @Override
    public void returnItem() {
        available=true;
        System.out.println(" Book " + title + " is returned ");
    }

    @Override
    public void displayInfo() {
        System.out.println("Book " + title + " Author " + author + " Is available " + available );
    }
}
