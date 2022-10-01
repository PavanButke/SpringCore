package com.dap.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    	
    	//get the parent bean calling over iocContainer
    	Item item= (Item)iocContainer.getBean("Item");
    	System.out.println("Item bean "+ item);
    	
    	//get the child bean calling over iocContainer
    	Order order= (Order)iocContainer.getBean("Order");
    	System.out.println("Order bean "+ order);
    }
}
