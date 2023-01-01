package com.priyanka.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class HdfcAtm implements Atm{
	@Autowired
	private Bank bank;

	public void withdraw(int acno, double amount) {
		System.out.println("withdraw money");
		bank.withdraw(3344, acno, amount);
	}

	public void withdraw(int acno, int amount) {
		// TODO Auto-generated method stub
		
	}

}
