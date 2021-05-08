package eTicaret.business.abstracts;

import eTicaret.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(String ePosta,String password);

}
