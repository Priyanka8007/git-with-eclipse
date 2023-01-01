package com.priyanka.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.priyanka.component.Atm;
import com.priyanka.component.Calculator;

import com.priyanka.component.HelloWorld;

public class App {
	public static void main(String[] args) {
	//Loading spring//IOC CONTAINER
	ApplicationContext ctx = new ClassPathXmlApplicationContext("my_spring_config.xml");
	HelloWorld hw = (HelloWorld) ctx.getBean("hello");
	System.out.println(hw.sayHello("Priya"));
    Calculator cal =(Calculator) ctx.getBean("calc");
    System.out.println(cal.add(10,30));
    System.out.println(cal.sub(40,10));
    Atm atm = (Atm) ctx.getBean("hdfcatm");
    atm.withdraw(2233344, 67777);

    

}
}
