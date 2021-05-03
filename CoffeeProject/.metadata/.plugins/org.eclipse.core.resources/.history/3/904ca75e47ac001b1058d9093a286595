package Concrete;


import Entities.Customer;
import Abstract.BaseCustomerManager;

public class NeroCustomerManager extends BaseCustomerManager{

	private CustomerCheckService _customerCheckService;
	public void Save(Customer customer) {
		
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}

}
