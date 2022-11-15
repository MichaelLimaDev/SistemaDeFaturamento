package model.entity;

import java.util.ArrayList;

public class Invoice {

    private int id;
    private double valorTotal;
    private int product_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getProduct() {
        return product_id;
    }

    public void setProduct(int product_id) {
        this.product_id = product_id;
    }
}
