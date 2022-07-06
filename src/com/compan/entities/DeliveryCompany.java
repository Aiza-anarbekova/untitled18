package com.compan.entities;

import java.util.ArrayList;
import java.util.List;

public class DeliveryCompany {
    private  String deliveryCompanyName;
    final int pricePerKilogram=12;
    private List<Customer> customers=new ArrayList<>();
    final int maxCapacityPerSquareMeter=133;

    public DeliveryCompany(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }
    public  void addCustomer(Customer customer){
        customers.add(customer);
    }
    public int getCustomerFee(String name){
        for (var a:customers) {
            if (a.getCustomerName()==name){
                return a.getOrderFee();
            }
        }
        return 0;

    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public int getPricePerKilogram() {
        return pricePerKilogram;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public int getMaxCapacityPerSquareMeter() {
        return maxCapacityPerSquareMeter;
    }
}
