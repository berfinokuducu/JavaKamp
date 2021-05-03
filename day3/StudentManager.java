package day3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user)
	{
		System.out.println("Ogrenci : "+user.getEmail());
	}
	@Override
	public void update(User user)
	{
		System.out.println("Ogrenci guncellendi : "+user.getEmail());
	}
	@Override
	public void delete(User user)
	{
		System.out.println("Ogrenci silindi : "+user.getEmail());
	}
	
	

}
