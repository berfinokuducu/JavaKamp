package day4.Abstract;

import day4.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to db : " + customer.getFirstName());
		
	}
}
