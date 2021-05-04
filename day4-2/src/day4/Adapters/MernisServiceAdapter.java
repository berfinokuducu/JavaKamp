package day4.Adapters;
import java.rmi.RemoteException;

import day4.Abstract.CustomerCheckService;
import day4.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), 
				Integer.parseInt(customer.getDateofBirth()));
		
	}

}
