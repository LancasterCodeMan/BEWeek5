package videoCurriculum;

public class Encapsulation {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstnName("Sally");
		student.setPhoneNumber("1234567890");
		student.introduce();
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		rec.setLength(10);
		System.out.println(rec.getArea());

		/* 
		 * Access Modifiers:
		 * -public  accessible everywhere
		 * -private only accessible within the class itself
		 * -protected accessible within the class, other classes in the same package, and all subclasses
		 * -No Modifier same as protected, except not accessible in a subclass in different package
		 * 
		 */
	}

}
