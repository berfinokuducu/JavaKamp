package eTicaret.core.concretes;

import eTicaret.Google.GoogleManager;
import eTicaret.core.abstracts.RegisterService;
import eTicaret.entities.concretes.User;

public class GoogleManagerAdapter implements RegisterService{

	@Override
	public void register(User user){
		GoogleManager googleManager=new GoogleManager();
		googleManager.register(user.getePosta());
		
	}

}
