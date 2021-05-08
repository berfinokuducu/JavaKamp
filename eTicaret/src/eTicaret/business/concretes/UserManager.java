package eTicaret.business.concretes;

import eTicaret.business.abstracts.BaseRegisterService;
import eTicaret.business.abstracts.EPostaVerificationService;
import eTicaret.business.abstracts.UserValidationService;
import eTicaret.core.abstracts.EPostaService;
import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class UserManager extends BaseRegisterService{
	private UserValidationService validate;
	private UserDao userDao;
	private EPostaVerificationService verification;
	private EPostaService ePosta;
	
	public UserManager(UserValidationService validate,UserDao userDao,EPostaVerificationService verification,EPostaService ePosta) {
		this.validate = validate;
		this.userDao=userDao;
		this.verification=verification;
		this.ePosta=ePosta;
		
	}
	@Override
	public void register(User user) throws Exception{
		if(validate.validateUser(user))
		{
			
			if(userDao.getUserByEposta(user.getePosta())==null)
			{
				ePosta.sendEPosta(user.getePosta());
				if(verification.activate())
				{
					System.out.println("Kullan�c� sisteme kaydedildi "+user.getFirstName()+" "+user.getLastName());
					
				}
				else
				{
					throw new Exception("E-posta do�rulama ba�ar�s�z.");
				}
				
				
			}
			else {
				throw new Exception("Bu e-posta ile sisteme kay�tl� ba�ka bir kullan�c� var.");
			}
		}
		else {
			throw new Exception("Girdi�iniz bilgiler do�ru formatta de�il. L�tfen kontrol ediniz.");
		}
		
	}

}
