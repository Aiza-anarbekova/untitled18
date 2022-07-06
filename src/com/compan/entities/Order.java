package com.compan.entities;

public class Order {
    private int orderFee;
    private Load load;

    public Order(int orderFree, Load load) {
        this.orderFee = orderFree;
        this.load = load;
    }
    public int getArea(){
        return load.getHeight()*load.getWidth();
    }

    public int getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(int orderFee) {
        this.orderFee = orderFee;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }
}
