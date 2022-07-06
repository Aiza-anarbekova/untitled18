package com.compan.service;

import com.compan.entities.Customer;
import com.compan.entities.DeliveryCompany;
import com.compan.entities.Order;

import java.util.*;

public class DeliveryCompanyService {
   public Map<String ,DeliveryCompany> deliveryCompanies;

    public DeliveryCompanyService(Map<String,DeliveryCompany> deliveryCompanies ) {
        this.deliveryCompanies=deliveryCompanies;
    }

    public void acceptOrder(List<Order> orders, DeliveryCompany deliveryCompany, String customerName) {
        for (Order o:orders) {
            if (o.getArea()>deliveryCompany.getMaxCapacityPerSquareMeter()){
                System.out.println("заказ не принят , превышен лимит по площади ");
                return;
            }
           // orders.stream().filter(z->z.getArea()>deliveryCompany.getMaxCapacityPerSquareMeter()).forEach(System.out::println);
        }
           Customer customer=new Customer(customerName,orders);
           deliveryCompany.addCustomer(customer);

    }
    public int getTotalFee(String customerName){
        int sum=0;
        for (var delivery:deliveryCompanies.values()) {
            sum+=delivery.getCustomerFee(customerName);
        }
        return sum;

    }
//    public int getCompanyProfit(String comName){
//
//    }
    public void creat(Map<String ,DeliveryCompany> deliveryCompanies) {
        deliveryCompanies.put("Globus", new DeliveryCompany("Globus"));
        deliveryCompanies.put("Glovo", new DeliveryCompany("Glovo"));
        deliveryCompanies.put("Navat", new DeliveryCompany("Navat"));

        // getCompanyProfit(String comName)
        //получить делив.comp po imeni
        //poluchit summ plateja kajdogo polzov(foreach)
        // return znachenie summ

        //creat(String deliverycompanyname)
        // sozdat novyi deliverycompany
        //dobavit map


    }
}
