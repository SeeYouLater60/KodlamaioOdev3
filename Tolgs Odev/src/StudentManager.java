
public class StudentManager extends UserManager {

	public void login(Students student) {
		System.out.println("Öðrenci olarak giriþ yapýldý: "+student.getFullName());
	}
	
	public void logout(Students student) {
		System.out.println("Öðrenci olarak çýkýþ yapýldý: "+student.getFullName());
	}
}
