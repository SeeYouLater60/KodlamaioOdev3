
public class InstructorManager extends UserManager{

	public void login (Instructors instructor) {
		System.out.println("Hoca olarak giri� yap�ld�: "+instructor.getFullName());
	}
	
	public void logout (Instructors instructor) {
		System.out.println("Hoca olarak ��k�� yap�ld�: "+instructor.getFullName());
	}
	
}
