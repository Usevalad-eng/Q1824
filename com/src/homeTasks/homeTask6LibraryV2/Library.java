package homeTasks.homeTask6LibraryV2;

public class Library {
    protected LibraryItem[] items;
    protected int itemCount;

    public Library(int capacity) {
        this.items = new LibraryItem[capacity];
        this.itemCount = 0;
    }

    public void addItem(LibraryItem item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
            System.out.println("New element is added " + item.getTitle());
        } else {
            System.out.println("Library is full");
        }
    }

    public void displayAvailableItems() {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].isAvailable()) {
                items[i].displayInfo();
            }
        }
    }

    public void borrowItem(String title) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getTitle().equals(title)) {
                items[i].borrow();
                break;
            } else if (!items[i].equals(title)) {
                //System.out.println("Element is not found");
            } else {
                //System.out.println("Element " + title + " is not found ");
                //break;
            }
        }
    }

    public void returnItem(String title) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getTitle().equals(title)) {
                items[i].returnItem();
                break;
            } else {
                //System.out.println("Element " + title + " is not found ");
                //break;
            }
        }

    }
}
