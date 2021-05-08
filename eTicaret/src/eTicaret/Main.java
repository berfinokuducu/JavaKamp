package eTicaret;

import eTicaret.business.concretes.AuthManager;
import eTicaret.business.concretes.EPostaVerificationManager;
import eTicaret.business.concretes.UserManager;
import eTicaret.business.concretes.UserValidationManager;
import eTicaret.core.concretes.EPostaManager;
import eTicaret.core.concretes.GoogleManagerAdapter;
import eTicaret.dataAccess.concretes.HibernateUserDao;
import eTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user=new User();
		user.setePosta("berfinokuducu@gmail.com");
		user.setFirstName("Berfin");
		user.setLastName("Okuducu");
		user.setId(1);
		user.setPassword("645622");
		System.out.println("----------Kullanýcý Bilgileri Ýle Üye Olma----------");
		AuthManager authManager=new AuthManager(new UserManager(new UserValidationManager(),new HibernateUserDao(),new EPostaVerificationManager(),new EPostaManager()),new HibernateUserDao());
		authManager.register(user);
		authManager.login("berfinokuducu@gmail.com", "645622");
		System.out.println("----------Google Hesabý Ýle Üye Olma----------");
		AuthManager authManager2=new AuthManager(new GoogleManagerAdapter(),new HibernateUserDao());
		authManager2.register(user);
		authManager2.login("berfinokuducu@gmail.com", "645622");
		
	}

}
