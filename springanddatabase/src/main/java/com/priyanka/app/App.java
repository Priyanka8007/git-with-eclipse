package com.priyanka.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.priyanka.component.CarPart;
import com.priyanka.component.CarPartsInventory;

public class App {
	
public static void main(String[] args)  {
	ApplicationContext ctx =new ClassPathXmlApplicationContext("my_spring_config.xml");
		CarPartsInventory inv =(CarPartsInventory) ctx.getBean("carParts1");
	CarPart cp =new CarPart();
	cp.setPartName("nut and bolt");
	cp.setCarMode("maruti665");
	cp.setPrice(34);
	cp.setQuantity(88);
	inv.addNewPart(cp);
	
}
    

}
