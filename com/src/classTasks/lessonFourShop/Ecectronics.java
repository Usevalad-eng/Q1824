package classTasks.lessonFourShop;

public class Ecectronics extends Product{

    protected String model;
    protected String brand;

    public Ecectronics(String name, double price, int stockQuontity, String brand, String model) {
        super(name, price, stockQuontity);
        this.brand=brand;
        this.model=model;
    }

    @Override
    public void displayinfo() {
        System.out.println(" Electronics " + name +" "+ "price " + price + " model " + model + " brand " + brand +
                " available " + stockQuantity);
    }
}
