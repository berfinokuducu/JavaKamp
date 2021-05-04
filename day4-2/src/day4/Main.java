package day4;
import day4.Abstract.BaseCustomerManager;
import day4.Adapters.MernisServiceAdapter;
import day4.Concrete.*;
import day4.Entities.Customer;
public class Main {

	public static void main(String[] args) {
		Customer customer= new Customer();
		customer.setId(1);
		customer.setFirstName("Berfin");
		customer.setLastName("Okuducu");
		customer.setNationalityId("00000000000");
		customer.setDateofBirth("1998");
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		
		try
		{
			customerManager.save(customer);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
