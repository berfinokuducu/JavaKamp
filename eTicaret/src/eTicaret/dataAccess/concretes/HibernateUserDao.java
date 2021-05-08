package eTicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	User user=new User(1,"Berfin","Okuducu","berfinokuducu@gmail.com","645622");
	List<User> users=new ArrayList<User>();
	public HibernateUserDao()
	{
		users.add(user);
	}
	
	@Override
	public void add(User user) {
		System.out.println("Kayýt baþarýlý "+user.getFirstName());
		users.add(user);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public User getUserByEposta(String ePosta) {
		for(User user:users)
		{
			if(user.getePosta().equals(ePosta))
			{
				return user;
			}
				
		}
		return null;
	}

}
