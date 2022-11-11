package model.entity;

public class Product {
    private int id;
    private String productName;
    private double productValue;
    private int productQuantity;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }

    public void setProductQuantity(int productQuantity) {
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
