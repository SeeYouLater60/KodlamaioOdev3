
public class StudentManager extends UserManager {

	public void login(Students student) {
		System.out.println("��renci olarak giri� yap�ld�: "+student.getFullName());
	}
	
	public void logout(Students student) {
		System.out.println("��renci olarak ��k�� yap�ld�: "+student.getFullName());
	}
}
