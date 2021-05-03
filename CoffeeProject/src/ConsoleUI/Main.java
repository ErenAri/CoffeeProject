package ConsoleUI;

import Abstract.BaseCustomerManager;

import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Customer(1,"Eren","Arý",2004,"111111111");
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());

		baseCustomerManager.save(customer);
		

	}

}
