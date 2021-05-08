package eTicaret.core.abstracts;

import eTicaret.entities.concretes.User;

public interface RegisterService {
	void register(User user) throws Exception;
}
