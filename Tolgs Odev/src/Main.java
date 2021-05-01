
public class Main {

	public static void main(String[] args) {
		
		Students user1 = new Students();
		user1.setId(11231);
		user1.setFullName("Tolga Yaradanakul");
		
		Instructors user2 = new Instructors();
		user2.setId(1231099);
		user2.setFullName("Bilgehan Yaradanakul");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(user1);
		System.out.println("----------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(user2);
		
	}

}
