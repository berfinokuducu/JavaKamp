package eTicaret.business.concretes;

import eTicaret.business.abstracts.UserValidationService;
import eTicaret.entities.concretes.User;
import java.util.regex.Pattern;
public class UserValidationManager implements UserValidationService{
	private static final String emailFormat = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

	@Override
	public boolean validateUser(User user) {
		if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getePosta().isEmpty() && !user.getPassword().isEmpty())
		{
			if(user.getPassword().length()<6)
			{
				return false;
			}
			if(user.getFirstName().length()<2 || user.getLastName().length()<2)
			{
				return false;
			}
			if(!Pattern.compile(emailFormat).matcher(user.getePosta()).matches())
			{
				return false;
			}
			return true;
		}
		return false;
		
	}

}
