package day4gameProject.Abstract;

import day4gameProject.Entities.User;

public interface UserService {
	void add(User user) throws Exception;
	void update(User user)throws Exception;
	void delete(User user);
	
	
}
