
public class InstructorManager extends UserManager{

	public void login (Instructors instructor) {
		System.out.println("Hoca olarak giriþ yapýldý: "+instructor.getFullName());
	}
	
	public void logout (Instructors instructor) {
		System.out.println("Hoca olarak çýkýþ yapýldý: "+instructor.getFullName());
	}
	
}
