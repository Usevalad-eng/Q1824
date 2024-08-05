package classTasks.lessonFourShop;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
    public void processOrder(){
        if (product.isAvailable()&&product.stockQuantity>=quantity){
            product.decreaseStock(quantity);
            System.out.println("Order is processed");
            customer.displayInfo();
            product.displayinfo();
        }else {
            System.out.println("Can not process the good, no such good on the store");
        }
    }
}
