package com.bluenile.capstonebluenile.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "quantity")
    private int quantity;
    @Column(name = "item")
    private String item;

    @Column(name = "price")
    private double price;

    public Order() {
        this.item = item;
    }

    public Order(int quantity, String item, double price) {
        this.quantity = quantity;
        this.item = item;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
