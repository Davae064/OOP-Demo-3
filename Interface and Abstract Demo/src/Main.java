import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setId(12312);
		customer1.setName("Bilgehan");
		customer1.setSurname("Yaradanakul");
		customer1.setNationalNumber("12345438901");
		customer1.setDateOfBirth(LocalDate.of(2004, 03, 12));
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.save(customer1);
		
		System.out.println("-----------------------------------------");
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
		baseCustomerManager2.save(customer1);
		
		
		
	}

}
