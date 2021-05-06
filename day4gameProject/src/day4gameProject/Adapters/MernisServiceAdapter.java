package day4gameProject.Adapters;

import java.rmi.RemoteException;

import day4gameProject.Abstract.UserCheckService;
import day4gameProject.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) throws RemoteException {
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(
				Long.parseLong(user.getNationalityId()), 
				user.getFirstName().toUpperCase(), 
				user.getLastName().toUpperCase(), 
				Integer.parseInt(user.getDateofBirth()));
	}

}
