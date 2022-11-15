package view;

import model.entity.Product;

public class Terminal {
    public static void main(String[] args) {
        Product product = new Product();

        product.setProductName("Pão");
        product.setProductValue(20.00);
        product.setProductQuantity(5);

        ProductDAO productDAO = new ProductDAO();

        productDAO.insertProductDatabase(product);
        for (Product productss: productDAO.getAllProductsDatabase()) {
            System.out.println(productss.getId());
            System.out.println(productss.getProductName());
            System.out.println(productss.getProductValue());
            System.out.println(productss.getProductQuantity());
        }
    }
}
