package Invoice.product;

public class Product {
    public String productName;
    public double productValue;
    public int productQuantity;

    public Product(String productName, double productValue, int productQuantity) {
        this.productName = productName;
        this.productValue = productValue;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductValue() {
        return productValue;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
