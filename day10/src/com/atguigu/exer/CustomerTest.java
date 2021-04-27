package com.atguigu.exer;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer = new Customer("Jane","smith");
		customer.setAccount(new Account(1000,2000,0.0123));
		
		Account account2 = customer.getAccount();
		account2.deposit(100);
		account2.withdraw(960);
		account2.withdraw(2000);
		System.out.println(customer);
	}
}
