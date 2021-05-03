package Concrete;

import Abstract.CustomerCheckService;

import Entities.Customer;
import sun.security.util.ECKeySizeParameterSpec;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return true;
	}

	
}
