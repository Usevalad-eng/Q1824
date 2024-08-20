package homeTasks.homeTask6LibraryV2;

public abstract class LibraryItem implements Borrowable{

    protected String title;
    protected boolean available;

    public LibraryItem(String title) {
        this.title = title;
        this.available = true;
    }


    @Override
    public boolean isAvailable() {
        return available;
    }

    public abstract void displayInfo();

    public String getTitle() {
        return title;
    }
}
