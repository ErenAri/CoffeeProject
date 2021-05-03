package ConsoleUI;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Eren");
		customer.setLastName("Arý");
		customer.setDateofBirth(2004);
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager();
		baseCustomerManager.Save(customer);

	}

}
