package com.compan;

import com.compan.entities.DeliveryCompany;
import com.compan.entities.Load;
import com.compan.entities.Order;
import com.compan.service.DeliveryCompanyService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       Load load=new Load(8,8,4);

        Order order=new Order(358,load);

        List<Order> orders=new ArrayList<>();
        orders.add(order);

        Map<String,DeliveryCompany> map=new HashMap<>();
        map.put("Dodo",new DeliveryCompany("Dodo"));
        map.put("Yandex",new DeliveryCompany("Yandex"));


        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService(map);
        deliveryCompanyService.acceptOrder(orders,map.get("Yandex"),"Aziza");
        System.out.println(deliveryCompanyService.getTotalFee("Aziza"));
      //  deliveryCompanyService.creat("Globus",new DeliveryCompany("Globus",));


    }
}
