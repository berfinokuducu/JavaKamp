package day3;

public class Main {

	public static void main(String[] args) {
		Student student=new Student("Berfin","Okuducu","Istanbul");
		student.setId(1);
		student.setEmail("berfinokuducu@gmail.com");
		
		Instructor instructor=new Instructor("Engin","Demirog","MCT,PMP,ITIL");
		instructor.setId(1);
		instructor.setEmail("engindemirog@xxx");
		
		
		Instructor[] instructors=new Instructor[] {instructor};
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.listInstructor(instructors);
		System.out.println("------Eklenen Kurslar------");
		instructorManager.addCourse("Java");
		
		StudentManager studentManager=new StudentManager();
		System.out.println("------Eklenen Ogrenciler------");
		studentManager.add(student);
	}

}
