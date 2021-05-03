package day3;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user)
	{
		System.out.println("Egitmen : "+user.getEmail());
	}
	@Override
	public void update(User user)
	{
		System.out.println("Egitmen guncellendi : "+user.getEmail());
	}
	@Override
	public void delete(User user)
	{
		System.out.println("Egitmen silindi : "+user.getEmail());
	}
	
	
	public void addCourse(String courseName)
	{
		System.out.println(courseName + " eklendi.");
	}
	
	
}
