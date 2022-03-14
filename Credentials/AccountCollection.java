package Credentials;

import java.util.ArrayList;
import java.util.List;


public class AccountCollection {
	public static List<Account> customers = new ArrayList<>();
	
	public static void addCustomer(Account customer) {
		customers.add(customer);
	}
	
	public static void removeCustomer(Account customer) {
		if(customers.contains(customer)) {
			customers.remove(customer);
		}
	}
	
	public static void editCustomer(Account customer, Account newCustomer) {
		if(customers.contains(customer)) {
			customers.set(customers.indexOf(customer), newCustomer);
		}
	}
}
