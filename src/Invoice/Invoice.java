package Invoice;

import Invoice.product.Product;

import java.util.ArrayList;

public class Invoice {

    private double valorTotal;
    private final ArrayList<Product> listProducts = new ArrayList<>();

    public void addProducts(String productName, double productValue, int productQuantity) {
        this.listProducts.add(new Product(productName, productValue, productQuantity));
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public ArrayList<Product> getListProducts() {
        return this.listProducts;
    }

}
