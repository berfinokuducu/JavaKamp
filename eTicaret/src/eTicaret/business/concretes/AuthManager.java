package eTicaret.business.concretes;

import eTicaret.business.abstracts.AuthService;
import eTicaret.core.abstracts.RegisterService;
import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class AuthManager implements AuthService{
	private RegisterService registerService;
	private UserDao userDao;

	public AuthManager(RegisterService registerService, UserDao userDao) {
		this.registerService = registerService;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		try {
			registerService.register(user);
			userDao.add(user);
		}
		catch (Exception e){
			System.out.println(e); 
		};
		
		
	}

	@Override
	public void login(String ePosta, String password) {
		User user= userDao.getUserByEposta(ePosta);
		if(user==null)
		{
			System.out.println("E-posta yanlýþ.");
			return;
		}
		if(user.getPassword().equals(password))
		{
			System.out.println("Giriþ baþarýlý");
			return;
		}
		System.out.println("Parola Hatalý");
		
	}
	

}
