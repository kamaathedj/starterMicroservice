package com.kamaathedj.SharedLogic;

public class Order{
    int orderId;
    String name;
    int items;

    public Order(int orderId, String name, int items) {
        this.orderId = orderId;
        this.name = name;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }
}
