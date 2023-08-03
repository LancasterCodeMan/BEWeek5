package videoCurriculum;

public class Classes {

	public static void main(String[] args) {
		
//		Student student1 = new Student();
//		student1.firstName = "Tom";
//		student1.lastName = "Smith";
//		student1.gradeLevel = 12;
//		student1.phoneNumber = "480-12-4567";
		
//		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle", "402-560-1481", 12);
		student3.introduce();
		

	}

}
