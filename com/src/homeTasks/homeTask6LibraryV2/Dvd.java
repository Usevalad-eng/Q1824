package homeTasks.homeTask6LibraryV2;

public class Dvd extends LibraryItem{
    public int duration;

    public Dvd(String title, int duration) {
        super(title);
        this.duration=duration;
    }

    @Override
    public void borrow() {
        if (available){
            available = false;
            System.out.println("DVD " + title + " is issued");
        } else {
            System.out.println("DVD " + title + " is not available");
        }
    }

    @Override
    public void returnItem() {
        available=true;
        System.out.println("DVD " + title + " is returned");
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD " + title + " Duaration " + duration + " Is available " + available );
    }
}
