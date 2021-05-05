package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService iCustomerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		this.iCustomerCheckService = iCustomerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if (iCustomerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db: "+customer.getName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

	

	
	
}
