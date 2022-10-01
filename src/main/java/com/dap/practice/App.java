package com.dap.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
    	//IoC container
    	
//    	//get the parent bean calling over iocContainer
//    	Item item= (Item)iocContainer.getBean("Item");
//    	System.out.println("Item bean "+ item);
//    	
    	//get the child bean calling over iocContainer
    	Order order= (Order)iocContainer.getBean("Order_1");
    	System.out.println("Order bean "+ order);
    	 order= (Order)iocContainer.getBean("Order_1");
    	System.out.println("Order bean "+ order);
    	 order= (Order)iocContainer.getBean("Order");
    	System.out.println("Order bean "+ order);
    	
//    	Map<String , Order> mapOfOrders = iocContainer.getBeansOfType(com.dap.practice.Order.class);
//    	Set<String> set = mapOfOrders.keySet();
//    	Iterator<String> itr = set.iterator();
//    	
//    	double totalPrice=0.0;
//    	while(itr.hasNext()) {
//    		String beanId = itr.next();
//    		Order order = mapOfOrders.get(beanId);
//    		
//    		totalPrice = totalPrice + order.getItem().getPrice();
//    	}
//    	
//    	System.out.println("Total Price of Order "+ totalPrice);
    }
}
