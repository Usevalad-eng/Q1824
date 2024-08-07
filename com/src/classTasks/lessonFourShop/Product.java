package classTasks.lessonFourShop;

public abstract class Product {
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String name, double price, int stockQuontity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuontity;
    }
    public abstract void displayinfo();

    public boolean isAvailable(){
        return stockQuantity > 0;
    }
    public void decreaseStock(int quantity){
        if (quantity<= stockQuantity){
            stockQuantity = stockQuantity-quantity;
        }else {
            System.out.println("There is no good on stock");
        }
    }

}
