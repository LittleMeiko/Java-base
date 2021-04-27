package com.atguigu.p2.ui;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

public class CustomerView {
	private CustomerList customerList = new CustomerList(10);
	
	public CustomerView() {
		Customer cust = new Customer("张三", '男', 30, "010-56784654", "abc@163.com");
		customerList.addCustomer(cust);
	}
	
	public void enterMainMenu() {
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("---------------------------客户信息管理管理软件---------------------------\n");
			System.out.println("---------------------------1.添加客户");
			System.out.println("---------------------------2.修改客户");
			System.out.println("---------------------------3.删除客户");
			System.out.println("---------------------------4.客户列表");
			System.out.println("---------------------------5.退    出\n");
			System.out.print("---------------------------请选择(1-5):");
			char menu = CMUtility.readMenuSelection();
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("请确认是否退出(Y/N):");
				char isExit = CMUtility.readConfirmSelection();
				if (isExit == 'Y') {
					isFlag = false;
				}
			}
		}
	}
	
	private void addNewCustomer() {
		System.out.println("---------------------------添加客户---------------------------");
		System.out.print("姓名:");
		String name = CMUtility.readString(10);
		System.out.print("性别:");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话:");
		String phone = CMUtility.readString(15);
		System.out.print("邮箱:");
		String email = CMUtility.readString(30);
		
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customerList.addCustomer(customer);
		if (isSuccess) {
			System.out.println("---------------------------添加客户完成---------------------------\n");
		}else {
			System.out.println("---------------------------客户列表已满，添加失败---------------------------\n");
		}
	}
	
	private void modifyCustomer() {
		System.out.println("---------------------------修改客户---------------------------");
		int number;
		Customer customer;
		for(;;) {
			System.out.print("请选择待修改的客户编号(-1退出):");
			number = CMUtility.readInt();
			if(number == -1) {
				return;
			}
			
			customer = customerList.getCustomer(number - 1);
			if (customer == null) {
				System.out.println("无法找到指定客户!");
			}else {
				break;
			}
		}
		
		System.out.print("姓名(" + customer.getName() + "):");
		String name = CMUtility.readString(10, customer.getName());
		System.out.print("性别(" + customer.getGender() + "):");
		char gender = CMUtility.readChar(customer.getGender());
		System.out.print("年龄(" + customer.getAge() + "):");
		int age = CMUtility.readInt(customer.getAge());
		System.out.print("电话(" + customer.getPhone() + "):");
		String phone = CMUtility.readString(15, customer.getPhone());
		System.out.print("邮箱(" + customer.getEmail() + "):");
		String email = CMUtility.readString(30, customer.getEmail());
		Customer newCust = new Customer(name, gender, age, phone, email);
		boolean isReplaced = customerList.replaceCustomer(number - 1, newCust);
		if (isReplaced) {
			System.out.println("---------------------------修改完成---------------------------\n");
		}
	}
	
	private void deleteCustomer() {
		System.out.println("---------------------------删除客户---------------------------");
		int number;
		Customer customer;
		for(;;) {
			System.out.print("请选择待删除的客户编号(-1退出):");
			number = CMUtility.readInt();
			if(number == -1) {
				return;
			}
			
			customer = customerList.getCustomer(number - 1);
			if (customer == null) {
				System.out.println("无法找到指定客户!");
			}else {
				break;
			}
		}
		
		System.out.print("请确认是否删除(Y/N):");
		char isDelete = CMUtility.readConfirmSelection();
		if (isDelete == 'Y') {
			boolean deleteSuccess = customerList.deleteCustomer(number-1);
			if (deleteSuccess) {
				System.out.println("---------------------------删除完成---------------------------");
			}
		}
	}
	
	private void listAllCustomers() {
		System.out.println("---------------------------客户列表---------------------------\n");
		int total = customerList.getTotal();
		if (total == 0) {
			System.out.println("暂时没有客户!");
		}else {
			Customer[] allCustomers = customerList.getAllCustomers();
			System.out.println("编号" + "\t" + "姓名" + "\t" + "性别" + "\t" + "年龄" + "\t" + "电话" + "\t\t" + "邮箱");
			for (int i = 0; i < allCustomers.length; i++) {
				Customer customer = allCustomers[i];
				System.out.println((i + 1) + "\t" + customer.getName() + "\t" + customer.getGender() + "\t" + 
				customer.getAge() + "\t" + customer.getPhone() + "\t" + customer.getEmail());
			}
		}
		
		System.out.println("---------------------------客户列表完成---------------------------\n");
	}
	
	public static void main(String[] args) {
		CustomerView customerView = new CustomerView();
		customerView.enterMainMenu();
	}
}
