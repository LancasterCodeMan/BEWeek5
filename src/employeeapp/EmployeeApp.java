package employeeapp;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee salary = new SalariedEmployee("Tom", "Sawyer", 2500.00);
		Employee hourly = new HourlyEmployee("Tim", "Smith", 15.00, 75.5 );
		Employee manager = new Manager("Rob", "Lincoln", 45000, 15.5);

		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
	}

}
