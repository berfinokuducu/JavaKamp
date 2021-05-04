package day4.Concrete;

import day4.Abstract.BaseCustomerManager;
import day4.Abstract.CustomerCheckService;
import day4.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception
	{
		if(customerCheckService.checkIfRealPerson(customer))
		{
			super.save(customer);
		}
		else {
			throw new Exception("Not a valid person");	
		}
	}
}
