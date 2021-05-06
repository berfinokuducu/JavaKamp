package day4gameProject.Concrete;


import day4gameProject.Abstract.UserCheckService;
import day4gameProject.Abstract.UserService;
import day4gameProject.Entities.User;

public class UserManager implements UserService {
	private UserCheckService userCheckService;
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) throws Exception {
		if(userCheckService.checkIfRealPerson(user))
		{
			System.out.println(user.getFirstName()+ " "+user.getLastName()+" veritabanýna eklendi.");
		}
		else {
			throw new Exception("Not a valid person");
		}
		
	}

	@Override
	public void update(User user) throws Exception {
		if(userCheckService.checkIfRealPerson(user))
		{
			System.out.println(user.getFirstName()+ " "+user.getLastName()+" güncellendi");
		}
		else {
			throw new Exception("Not a valid person");
		}
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" silindi");
		
	}


}
