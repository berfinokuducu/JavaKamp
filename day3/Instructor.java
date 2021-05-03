package day3;

public class Instructor extends User{
	private String firstName;
	private String lastName;
	private String detail;
	public Instructor()
	{
		
	}
	public Instructor(String firstName, String lastName, String detail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.detail = detail;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

}
