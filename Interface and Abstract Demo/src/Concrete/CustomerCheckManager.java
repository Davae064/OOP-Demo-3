package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		if(customer.getNationalNumber() == "12345678901" ) {
			return true;
		}else {
			return false;
		}
		
	}

}
