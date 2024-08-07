package classTasks.lessonFourShop;

import java.sql.SQLOutput;

public class OnlineStore {
    private Product[] products;
    private int productCount;

    public OnlineStore(int maxProduct) {
        products = new Product[maxProduct];
        productCount = 0;
    }
    public void addProduct(Product product){
        if (productCount<products.length){
            products[productCount]=product;
            productCount++;
            System.out.println("Product is added");
        }else {
            System.out.println("Can't add product");
        }
    }
    public void displayAllProducts(){
        System.out.println("Goods in the store:  ");
        for (int i=0;i<productCount;i++){
            products[i].displayinfo();
        }
    }
}
