package view.functions.interaction;

import model.dao.ProductDAO.functions.InsertProductDatabase;
import model.entity.Product;

public class AddItem {
    public void insertItem(String productName, double productValue, int productQuantity) {
        Product product = new Product();

        product.setProductName(productName);
        product.setProductValue(productValue);
        product.setProductQuantity(productQuantity);

        InsertProductDatabase insertProduct = new InsertProductDatabase(product);
        insertProduct.insertDatabase();
    }
}
