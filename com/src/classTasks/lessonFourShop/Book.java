package classTasks.lessonFourShop;

public class Book extends Product{
    protected String author;
    protected int pages;

    public Book(String name, double price, int stockQuontyty, String author, int pages) {
        super(name, price, stockQuontyty);
        this.author=author;
        this.pages=pages;
    }

    @Override
    public void displayinfo() {
        System.out.println(" Book  " + name + " price  " + price + " author " + author + " pages " + pages +
                " available " + stockQuantity);
    }
}
