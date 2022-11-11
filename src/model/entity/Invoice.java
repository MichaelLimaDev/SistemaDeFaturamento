package model.entity;

import java.util.ArrayList;

public class Invoice {

    private double valorTotal;
    private ArrayList<Product> listProducts;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ArrayList<Product> listProducts) {
        this.listProducts = listProducts;
    }
}
