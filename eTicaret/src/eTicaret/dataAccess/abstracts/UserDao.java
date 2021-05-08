package eTicaret.dataAccess.abstracts;

import java.util.List;

import eTicaret.entities.concretes.User;

public interface UserDao {
	void add(User user);
	List<User> getAll();
	User getUserByEposta(String ePosta);
}
