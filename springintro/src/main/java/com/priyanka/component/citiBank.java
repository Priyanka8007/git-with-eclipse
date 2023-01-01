package com.priyanka.component;

import org.springframework.stereotype.Component;

@Component
public class citiBank implements Bank{

	public void withdraw(int atmid, int acno, double amount) {
		System.out.println("money credited");
		
	}

}
