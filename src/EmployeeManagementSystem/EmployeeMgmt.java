package EmployeeManagementSystem;

public class EmployeeMgmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee e1 = new Employee("Ram", 22,"Frontend",30000);
	        Manager m1 = new Manager("Shyam", 25,"Backend",50000,6000);

	        e1.displayEmployeeInfo();
	        m1.displayEmployeeInfo();

	        e1.raiseSalary(16);
	        m1.raiseSalary(19);


	        e1.displayEmployeeInfo();
	        m1.displayEmployeeInfo();

	}

}
