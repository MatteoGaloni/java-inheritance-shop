package org.lessons.java.shop;

import java.time.LocalDate;

public class Purchase {
    private LocalDate date;

    private int quantity;

    Product product;


    public Purchase(LocalDate date, int quantity, Product product) {
        this.date = date;
        this.quantity = quantity;
        this.product = product;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getTotal(){
        double singlePrice = product.getVatPrice();
        return singlePrice;
    }
}
