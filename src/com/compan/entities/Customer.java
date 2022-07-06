package com.compan.entities;

import java.util.List;

public class Customer {
    private String  customerName;
    List< Order> order;

    public Customer(String customerName, List<Order> order) {
        this.customerName = customerName;
        this.order = order;
    }

    public String getCustomerName() {
        return customerName;
    }
    public int getOrderFee(){
        int count=0;
        for (Order o:order) {
            count+=o.getOrderFee();
        }
        return count;
    }
}
