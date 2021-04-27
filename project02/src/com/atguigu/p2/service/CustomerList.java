package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

public class CustomerList {

	private Customer[] customers;
	private int total = 0;

	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	public boolean addCustomer(Customer customer) {
		if (this.total >= this.customers.length) {
			return false;
		}

		customers[this.total++] = customer;
		return true;
	}

	public boolean replaceCustomer(int index, Customer cust) {
		if (index < 0 || index >= this.total) {
			return false;
		}

		this.customers[index] = cust;
		return true;
	}

	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= this.total) {
			return false;
		}

		for (int i = index; i < this.total - 1; i++) {
			this.customers[i] = this.customers[i++];
		}
		this.customers[this.total - 1] = null;
		total--;
		return true;
	}

	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for (int i = 0; i < custs.length; i++) {
			custs[i] = this.customers[i];
		}

		return custs;
	}

	public Customer getCustomer(int index) {
		if (index < 0 || index >= this.total) {
			return null;
		}

		return this.customers[index];
	}

	public int getTotal() {
		return this.total;
	}
}
