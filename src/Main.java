public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();

        invoice.addProducts("Pão", 20, 10);
        invoice.addProducts("Ovo", 0.25, 10);

        for (Product product: invoice.getListProducts()) {
            System.out.println(product.getProductName());
        }
    }
}