package day3;

public class UserManager {
	public void listInstructor(Instructor[] instructors) {
		for(Instructor instructor:instructors)
		{
			System.out.println("------Egitmenler------");
			System.out.println(instructor.getFirstName()+" "+instructor.getLastName());
		}
	}
	public void add(User user)
	{
		System.out.println(user.getEmail() + " eklendi");
	}
	public void update(User user)
	{
		System.out.println(user.getEmail() + " güncellendi");
	}
	public void delete(User user)
	{
		System.out.println(user.getEmail() + " silindi");
	}
	
}
