package com.geekbrains.product;

public class Product {
    private  int price;
    private  String name;
    private  int quantity;

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  int getQuantity() {
        return quantity;
    }

    public  void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
