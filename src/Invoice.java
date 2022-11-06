import java.util.ArrayList;

public class Invoice {

    private float valorTotal;
    private Product product;
    private ArrayList<Product> listProducts = new ArrayList<>();

    public void addProducts(String productName, double productValue, int productQuantity) {
        this.listProducts.add(new Product(productName, productValue, productQuantity));
    }

    public float getValorTotal() {
        return this.valorTotal;
    }

    public ArrayList<Product> getListProducts() {
        return this.listProducts;
    }

}
