package schoolapp;

public class Student {
	
	static int numberOfStudents;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	
	public Student() {}

	/* Constructors */
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
	}
	
	/* Public Methods */
	
	public void introduce() {
		System.out.println("Hello my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	/* Private methods */
	
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	/* Getters and Setters */
	
	public void setFirstnName(String firstName) {
		if (checkLength(firstName, 1)) {	
			this.firstName = firstName;
		}		
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setlastName(String lastName) {
		if (checkLength(firstName, 1)) {	
			this.lastName = firstName;
		}	
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(checkLength(phoneNumber, 9)) {
			this.phoneNumber = phoneNumber;
		}	
	}
	
	public String getPhoneNumer() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		if(gradeLevel > 0 && gradeLevel < 13) {
			this.gradeLevel = gradeLevel;
		}
		
	}
	
	public int getGradeLevel () {
		return gradeLevel;
	}
}
